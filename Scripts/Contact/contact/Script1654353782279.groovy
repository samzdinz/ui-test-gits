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

WebUI.navigateToUrl('https://gits.id/')

WebUI.setText(findTestObject('Object Repository/Contact/Page_GITS.ID - Mobile App Developer Experts_b5d59e/input_Have question in mind_your-name'), 
    'syamsudin')

WebUI.setText(findTestObject('Object Repository/Contact/Page_GITS.ID - Mobile App Developer Experts_b5d59e/input_Have question in mind_your-email'), 
    'samzdinz@gmail.com')

WebUI.setText(findTestObject('Object Repository/Contact/Page_GITS.ID - Mobile App Developer Experts_b5d59e/input_Have question in mind_your-phone'), 
    '087816964265')

WebUI.setText(findTestObject('Object Repository/Contact/Page_GITS.ID - Mobile App Developer Experts_b5d59e/textarea_Have question in mind_your-message'), 
    'UI Test GITS Indonesia')

WebUI.click(findTestObject('Object Repository/Contact/Page_GITS.ID - Mobile App Developer Experts_b5d59e/input_Have question in mind_cta-submit'))

WebUI.closeBrowser()

