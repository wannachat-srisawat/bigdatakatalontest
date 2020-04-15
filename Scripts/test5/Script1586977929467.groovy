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

WebUI.navigateToUrl('https://bda.co.th/')

WebUI.mouseOver(findTestObject('contact/Page_BIG DATA AGENCY/a_Contact'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/a_Contact'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/img'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 1_vnbx-button vnbx-next'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_Photo Gallery 12_vnbx-button vnbx-close'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/i_adminbdacoth_fab fa-facebook fa-2x'))

WebUI.mouseOver(findTestObject('contact/Page_BIG DATA AGENCY/div_adminbdacoth_col-sm-6 social'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/div_adminbdacoth_col-sm-6 social'))

WebUI.click(findTestObject('contact/Page_BIG DATA AGENCY/a_BIG DATA AGENCY CO LTD'))

title = WebUI.getWindowTitle()

WebUI.closeBrowser()

