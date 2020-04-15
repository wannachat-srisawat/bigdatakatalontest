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

WebUI.mouseOver(findTestObject('clients/Page_BIG DATA AGENCY/a_Clients'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/a_Clients'))

WebUI.scrollToElement(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/div_Here is a sample of our current and pas_1c9598'), 
    0)

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/li_Big Data'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/li_System Integration'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/li_AI NLP ML'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/li_Application'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/li_All'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/button_Next'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/button_Previous'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/button_Next'))

WebUI.click(findTestObject('Object Repository/clients/Page_BIG DATA AGENCY/button_Previous'))

WebUI.closeBrowser()

