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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Welcome 123hahaha', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

