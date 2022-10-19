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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 500Blue TopAdd to cartRs. 500Blue T_abe546'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - All Products/p_Blue Top'), 'Blue Top')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_AddedYour product has been added to car_d7d02f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h4_Added'), 'Added!')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_Cart'))

WebUI.verifyLinksAccessible(['https://www.automationexercise.com/view_cart'])

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Blue TopWomen  TopsRs. 5001Rs. 500'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Blue Top'), 'Blue Top')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Blue Top_cart_quantity_delete'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

