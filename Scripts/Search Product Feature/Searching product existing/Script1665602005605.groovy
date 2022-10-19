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

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_All Products'), 'ALL PRODUCTS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_All ProductsAddedYour product has been _e90caf'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_Category'), 'CATEGORY')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_WomenDress Tops Saree MenTshirts Jeans _e0e1cf'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_Brands'), 'BRANDS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_(6)Polo (5)HM (5)Madame (3)Mast  Harbou_8d694a'), 
    0)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - All Products/input_Contact us_search'), 'Winter Top')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Contact us_submit_search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Searched ProductsAddedYour product has _a70000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 600Winter TopAdd to cartRs. 600Wint_78c90e'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 600Winter TopAdd to cartRs. 600Wint_78c90e'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - All Products/input_Contact us_search'), 'NotProduct')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Contact us_submit_search'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

