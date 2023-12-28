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

WebUI.waitForElementPresent(findTestObject('AddProduct/btn_PlaceOrder'), 30)

WebUI.click(findTestObject('AddProduct/btn_PlaceOrder'))

WebUI.setText(findTestObject('Object Repository/BuyProduct/Name_Form'), GlobalVariable.NameForm)

WebUI.setText(findTestObject('Object Repository/BuyProduct/Country_Form'), GlobalVariable.CountryForm)

WebUI.setText(findTestObject('Object Repository/BuyProduct/City_Form'), GlobalVariable.CountryForm)

WebUI.setText(findTestObject('Object Repository/BuyProduct/CreditCard_Form'), GlobalVariable.CreditCardForm)

WebUI.setText(findTestObject('Object Repository/BuyProduct/MonthCC_Form'), GlobalVariable.MonthCCForm)

WebUI.setText(findTestObject('Object Repository/BuyProduct/YearCC_Form'), GlobalVariable.YearCCForm)

WebUI.click(findTestObject('Object Repository/BuyProduct/btn_Purchase'))

WebUI.waitForElementPresent(findTestObject('BuyProduct/txt_FinishOrder'), 30)

WebUI.verifyElementPresent(findTestObject('BuyProduct/txt_FinishOrder'), 60)

WebUI.click(findTestObject('Object Repository/BuyProduct/btn_OK_Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/BuyProduct/vrfy_MainPage'))

WebUI.closeBrowser()

