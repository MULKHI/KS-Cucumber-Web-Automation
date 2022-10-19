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

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_View Product'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Product Details/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Product Details/div_Men TshirtCategory Men  TshirtsRs. 400Q_196b2c'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/h2_Men Tshirt'), 'Men Tshirt')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/span_Rs. 400'), 'Rs. 400')

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/label_Quantity'), 'Quantity:')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/input_Quantity_quantity'), '6')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/div_AddedYour product has been added to car_d7d02f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/h4_Added'), 'Added!')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/a_Cart'))

WebUI.verifyLinksAccessible(['https://www.automationexercise.com/view_cart'])

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Men TshirtMen  TshirtsRs. 4006Rs. 2400'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Men Tshirt'), 'Men Tshirt')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 400'), 'Rs. 400')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_6'), '6')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 2400'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Men Tshirt_cart_quantity_delete'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

