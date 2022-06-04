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

WebUI.navigateToUrl('https://gits.id/jasa-google-cloud-modernization/')

WebUI.click(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/a_Dapatkan Sekarang'))

WebUI.setText(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_Nama Anda_your-name'), 
    'syamsudin')

WebUI.setText(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_Perusahaan_company-name'), 
    'square enix')

WebUI.setText(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_Email Bisnis Anda_your-email'), 
    'samzdinz@gmail.com')

WebUI.setText(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_Nomor Telepon Anda_your-phone'), 
    '087816964265')

WebUI.setText(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_Session maksimum dalam suatu waktu pe_066f24'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_Rata-rata konsumsi data per session (_dc38a1'), 
    '10')

WebUI.setText(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_RAM per server (contoh 16 GB)_ram-server'), 
    '16')

WebUI.click(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/input_RAM per server (contoh 16 GB)_wpcf7-f_a50db6'))

WebUI.click(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/button_Get Started_leadinModal-close'))

WebUI.click(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/a_Dapatkan Sekarang'))

WebUI.click(findTestObject('Object Repository/JasaCloud/Page_Jasa Cloud Modernization dari Google -_fd3a6f/a_Hubungi Kami'))

WebUI.closeBrowser()

