//import WebUI library
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

//import cucumber library
import cucumber.api.PendingException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		println " I am inside GIVEN step"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		println " I am inside WHEN step"
		WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), 'admin123')
	}

	@When("user enters (.*) and (.*) from data")
	public void user_enters_username_and_password_from_data(String username, String password) {
		println " I am inside WHEN step"
		WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), password)
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		println " I am inside AND step"
		WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))
	}

	@Then("check this message on the homepage")
	public void check_this_message_on_the_homepage() {
		println " I am inside THEN step"
		WebUI.verifyTextPresent('Welcome', false)
		WebUI.closeBrowser()
	}
}




