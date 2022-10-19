import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.automationexercise.com/')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Signup  Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_New User Signup'), 
    'New User Signup!')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'jokowi')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    'jokowi@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Signup/b_Enter Account Information'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Title'), 'Title')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mr_title'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Name'), 'Name *')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__name'), 'jokowi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Email'), 'Email *')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__email'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Password'), 'Password *')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), 'PRIySI4+YFCKffHy8Q9IYA==')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Date of Birth'), 'Date of Birth')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
    '2003', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Sign up for our newsletter'), 
    'Sign up for our newsletter!')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Receive special offers from our partners'), 
    'Receive special offers from our partners!')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Sign up for our newsletter_optin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Signup/b_Address Information'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_First name'), 'First name *')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), 'jokowi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Last name'), 'Last name *')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), 'dodo')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Company'), 'Company')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), 'banteng merah')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Address  (Street address, P.O. Box, C_77cafc'), 
    'Address * (Street address, P.O. Box, Company name, etc.)')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    'indonesia')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Address 2'), 'Address 2')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'), 'indonesia bagian barat')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Country'), 'Country *')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Canada', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_State'), 'State *')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), 'maluku')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_City'), 'City *')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), 'jakarta')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Zipcode'), 'Zipcode *')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), '07878')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Mobile Number'), 'Mobile Number *')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), '085873688898')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Created'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

