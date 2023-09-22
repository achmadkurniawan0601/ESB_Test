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

'Open to Browser'
WebUI.openBrowser('')

'Maximum browser display'
WebUI.maximizeWindow()

'Navigate to Destination URL'
WebUI.navigateToUrl('https://www.saucedemo.com')

'Input username from Object Repository Element ID'
WebUI.setText(findTestObject('login/loginUsername'), 'standard_user')

'Input password from Object Repository Element ID'
WebUI.setText(findTestObject('login/loginPassword'), 'secret_sauce')

'Submit username, and password'
WebUI.click(findTestObject('login/loginSubmit'))

'Verification elemen if success login'
WebUI.verifyElementVisible(findTestObject('login/verify'))

'Choose one item for buy'
WebUI.click(findTestObject('buyItems/jacketItem'))

'Choose more item for buy'
WebUI.click(findTestObject('buyItems/backpackItem'))

'If you done select for buy item, you can click Checkout'
WebUI.click(findTestObject('buyItems/checkoutItem'))

'Confirm you item cart'
WebUI.verifyElementVisible(findTestObject('buyItems/listCart'))

'Click Checkout items'
WebUI.click(findTestObject('buyItems/checkoutClick'))

'You in information contact'
WebUI.verifyElementVisible(findTestObject('buyItems/infomationContact'))

'Input First Name'
WebUI.setText(findTestObject('buyItems/firstName'), 'test')

'Input Last Name'
WebUI.setText(findTestObject('buyItems/lastName'), 'testing')

'Input Postal Code'
WebUI.setText(findTestObject('buyItems/postalCode'), '17134')

'Button continue if completed form'
WebUI.click(findTestObject('buyItems/continueBtn'))

'Verification before confirmation'
WebUI.verifyElementVisible(findTestObject('buyItems/checkoutOverview'))

'Click Finish'
WebUI.click(findTestObject('buyItems/finish'))

'Success order'
WebUI.verifyElementVisible(findTestObject('buyItems/successOrder'))

'Close browser'
WebUI.closeBrowser()

