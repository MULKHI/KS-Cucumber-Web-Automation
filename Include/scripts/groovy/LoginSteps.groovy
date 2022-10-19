import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginSteps {

	@Given("Users navigates to home page")
	def Users_navigates_to_home_page() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.automationexercise.com/')
		WebUI.takeScreenshot()
	}

	@And("Click on 'Signup / Login' button")
	def Click_on_Signup_Login_Buutton() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Signup  Login'))
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_Login to your account'),
				'Login to your account')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_New User Signup'),
			'New User Signup!')
	}

	@When("Enters an email (.*) and password (.*)")
	def Users_enters_valid_username_password(String email, String password) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_Login to your account'), 'Login to your account')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_Login to your account_email'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_Login to your account_password'), password)
		WebUI.takeScreenshot()
	}

	@And("Click on 'login' button")
	def Click_on_login_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Login'))
	}

	@Then("Users is navigated to home page with account")
	def Users_is_navigated_to_homepage_with_account() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as testing'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise/a_Logout'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise/a_Delete Account'))
		WebUI.takeScreenshot()

	}
	
	@And("Click on 'Logout' button then users back to login page")
	def Click_on_Logout_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Logout'))
		WebUI.verifyLinksAccessible(['https://www.automationexercise.com/login'])
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
	

	@Then("Users should NOT be able to login successfully")
	def Users_login_unsuccessfully() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/p_Your email or password is incorrect'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

}