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



class SearchProductSteps {

	@And("Click on 'products' button")
	def Click_on_products_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Products'))
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_All Products'), 'ALL PRODUCTS')
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_All ProductsAddedYour product has been _e90caf'), 0)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_Category'), 'CATEGORY')
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_WomenDress Tops Saree MenTshirts Jeans _e0e1cf'), 0)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_Brands'), 'BRANDS')
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_(6)Polo (5)HM (5)Madame (3)Mast  Harbou_8d694a'), 0)
		WebUI.takeScreenshot()
	}
	
	@When("Users enters (.*) into the search bar")
	def enters_ProductName_into_the_search_bar(String ProductName) {

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - All Products/input_Contact us_search'), ProductName)
		WebUI.takeScreenshot()
	}
	
	@And("Click on 'search' button")
	def Click_on_search_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Contact us_submit_search'))
	}
	
	@Then("Users will get (.*) result are shown on the results page")
	def result_are_shown_on_the_results_page(String ProductName) {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Searched ProductsAddedYour product has _a70000'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 600Winter TopAdd to cartRs. 600Wint_78c90e'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 600Winter TopAdd to cartRs. 600Wint_78c90e'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()

	}

}