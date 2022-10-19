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



class AddProductSteps {
	
	@When("Users click 'Add to cart' in product 'Blue Top'")
	def click_Add_to_cart_in_product_Blue_Top() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 500Blue TopAdd to cartRs. 500Blue T_abe546'))
		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - All Products/p_Blue Top'), 'Blue Top')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))
	}
	
	@And("Click 'Continue Shopping' button")
	def Click_Continue_Shopping_button() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_AddedYour product has been added to car_d7d02f'), 0)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h4_Added'), 'Added!')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Continue Shopping'))
	}
	
	@And("Click on 'Cart' button")
	def Click_on_Cart_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_Cart'))
		WebUI.verifyLinksAccessible(['https://www.automationexercise.com/view_cart'])
	}
	
	@Then("Users will get the result products are added to Cart")
	def products_are_added_to_Cart() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Blue TopWomen  TopsRs. 5001Rs. 500'), 0)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Blue Top'), 'Blue Top')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_1'), '1')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Blue Top_cart_quantity_delete'))
		WebUI.takeScreenshot()

	}
	
	@When("Users Click 'View Product' for any product")
	def Click_View_Product_for_any_product() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_View Product'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Product Details/img'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Product Details/div_Men TshirtCategory Men  TshirtsRs. 400Q_196b2c'))
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/h2_Men Tshirt'), 'Men Tshirt')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/span_Rs. 400'), 'Rs. 400')
		WebUI.takeScreenshot()
		
	}
	
	@And("Users add Increase quantity to (.*)")
	def Users_add_Increase_quantity_to_amount(String amount) {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/label_Quantity'), 'Quantity:')
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/input_Quantity_quantity'), amount)
		WebUI.takeScreenshot()
	}
	
	@And("Click 'Add to cart' button")
	def Click_Add_to_cart_button() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/button_Add to cart'))
	}
	
	@Then("Product is displayed in cart page with exact quantity (.*)")
	def Product_is_displayed_with_exact_quantity(String amount) {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Men TshirtMen  TshirtsRs. 4006Rs. 2400'))
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Men Tshirt'), 'Men Tshirt')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 400'), 'Rs. 400')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_6'), amount)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 2400'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Men Tshirt_cart_quantity_delete'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()

	}
	
	@And("Click 'X' button corresponding to particular product")
	def Click_button_delete_product_in_cart() {

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Blue Top_cart_quantity_delete'))
	}
	
	@Then("Product is removed from the cart")
	def Product_is_removed_from_the_cart() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Cart is empty Click here to buy products'), 
			'Cart is empty! Click here to buy products.')
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Cart is empty Click here to buy products'), 0)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()

	}
}