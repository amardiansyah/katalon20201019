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

resp = WS.sendRequest(findTestObject('API/SOAP/CountryAPI/ListOfCountryNamesByName'))
String xml = resp.getResponseBodyContent()
def dataValue = new XmlSlurper().parseText(xml)
println(' \n\n  data valu is \n\n ' + dataValue)
def value = dataValue.ListOfCountryNamesByNameResult.tCountryCodeAndName[12].sISOCode.text()

//ListOfCountryNamesByCodeResponse.ListOfCountryNamesByCodeResult.tCountryCodeAndName[224].sName
//ListOfCountryNamesByNameResponse.ListOfCountryNamesByNameResult.tCountryCodeAndName[17]
println('  >> value extracted is : ' + value)

GlobalVariable.CountryCode = value
println "  >  GlobalVariable.CountryCode : "+GlobalVariable.CountryCode

WS.sendRequestAndVerify(findTestObject('API/SOAP/CountryAPI/CapitalCity', [('countryCode') : GlobalVariable.CountryCode]))
