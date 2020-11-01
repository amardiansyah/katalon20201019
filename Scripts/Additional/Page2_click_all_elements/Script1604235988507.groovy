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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testing.lab.glcnetworks.com/page2/')

WebUI.click(findTestObject('Page2/th_item-0-name'))

WebUI.click(findTestObject('Page2/th_item-0-qty'))

WebUI.click(findTestObject('Page2/th_item-0-price'))

WebUI.click(findTestObject('Page2/th_item-0-total'))

WebUI.click(findTestObject('Page2/td_item-1-name'))

WebUI.click(findTestObject('Page2/td_item-1-qty'))

WebUI.click(findTestObject('Page2/td_item-1-price'))

WebUI.click(findTestObject('Page2/td_item-1-total'))

WebUI.click(findTestObject('Page2/td_item-2-name'))

WebUI.click(findTestObject('Page2/td_item-2-qty'))

WebUI.click(findTestObject('Page2/td_item-2-price'))

WebUI.click(findTestObject('Page2/td_item-2-total'))

WebUI.click(findTestObject('Page2/td_item-3-name'))

WebUI.click(findTestObject('Page2/td_item-3-qty'))

WebUI.click(findTestObject('Page2/td_item-3-price'))

WebUI.click(findTestObject('Page2/td_item-3-total'))

WebUI.click(findTestObject('Page2/td_item-4-name'))

WebUI.click(findTestObject('Page2/td_item-4-qty'))

WebUI.click(findTestObject('Page2/td_item-4-price'))

WebUI.click(findTestObject('Page2/td_item-4-total'))

WebUI.click(findTestObject('Page2/td_item-5-name'))

WebUI.click(findTestObject('Page2/td_item-5-qty'))

WebUI.click(findTestObject('Page2/td_item-5-price'))

WebUI.click(findTestObject('Page2/td_item-5-total'))

