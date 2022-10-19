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



class RegisterSteps {

	@When("Enters an name (.*) and email address (.*)")
	def Users_enters_name_email(String Name, String Email) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_New User Signup'), 'New User Signup!')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), Name)
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), Email)
		WebUI.takeScreenshot()
	}

	@And("Click on 'signup' button")
	def Click_on_signup_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))
		WebUI.takeScreenshot()
	}

	@And("Choose Title Mr.")
	def Choose_Title_Mr() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Signup/b_Enter Account Information'), 0)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Title'), 'Title')
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mr_title'))
	}

	@And("Input (.*) in field Name")
	def Input_Name_in_field_Name(String Name) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Name'), 'Name *')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__name'), Name)
		
	}

	@And("Check Email field cannot click")
	def Check_Email_field_cannot_click() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Email'), 'Email *')
		WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__email'))
		
	}

	@And("Input (.*) in field Password")
	def Input_Password_in_field_Password(String Password) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Password'), 'Password *')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), Password)
		
	}

	@And("Choose random Date of birth")
	def Choose_random_Date_of_birth() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Date of Birth'), 'Date of Birth')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
			'18', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
			'8', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
			'2003', true)

	}

	@And("Select checkbox : Sign up for our newsletter")
	def Checkbox_Signup_for_our_newsletter() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Sign up for our newsletter'), 
			'Sign up for our newsletter!')
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))
	}

	@And("Select checkbox : Receive special offers from our partners")
	def Checkbox_Receive_special_offers_from_our_partners() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Receive special offers from our partners'), 
			'Receive special offers from our partners!')
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Sign up for our newsletter_optin'))
	}

	@And("Input (.*) in field First Name")
	def Input_FirstName_in_field_First_Name(String FirstName) {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Signup/b_Address Information'), 0)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_First name'), 'First name *')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), FirstName)
	}

	@And("Input (.*) in field Last Name")
	def Input_LastName_in_field_Last_Name(String LastName) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Last name'), 'Last name *')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), LastName)
	}

	@And("Input (.*) in field Company")
	def Input_Company_in_field_Company(String Company) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Company'), 'Company')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), Company)
	}

	@And("Input (.*) in field Address")
	def Input_Address_in_field_Address(String Address) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Address  (Street address, P.O. Box, C_77cafc'), 
			'Address * (Street address, P.O. Box, Company name, etc.)')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
			Address)
	}

	@And("Input (.*) in field Address 2")
	def Input_Address2_in_field_Address(String Address2) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Address 2'), 'Address 2')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'), Address2)

	}

	@And("Choose Country Canada")
	def Choose_Country_Canada() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Country'), 'Country *')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
			'Canada', true)
	}

	@And("Input (.*) in field State")
	def Input_State_in_field_State(String State) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_State'), 'State *')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), State)
	}

	@And("Input (.*) in field City")
	def Input_City_in_field_City(String City) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_City'), 'City *')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), City)
	}

	@And("Input (.*) in field Zipcode")
	def Input_Zipcode_in_field_Zipcode(String Zipcode) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Zipcode'), 'Zipcode *')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), Zipcode)
	}

	@And("Input (.*) in field Mobile Number")
	def Input_MobileNumber_in_field_Mobile_Number(String MobileNumber) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Mobile Number'), 'Mobile Number *')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), MobileNumber)

	}

	@And("Click 'Create Account' button")
	def Click_Create_Account_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))
	}

	@And("Users is navigated to page ACCOUNT CREATED and click 'Continue' button")
	def Users_is_navigated_to_page_ACCOUNT_CREATED() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Created'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

	}
	
	@Then("Users cannot register using existing email address")
	def Users_cannot_register_using_existing_email_address() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/p_Email Address already exist'), 
			'Email Address already exist!')
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
		
	}
	
	@Then("Users cannot register and will navigated to fields Name")
	def Users_cannot_register_will_navigated_to_fields_Name() {

		WebUI.takeScreenshot()
		WebUI.closeBrowser()
		
	}
}