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

WebUI.mouseOver(findTestObject('portfolio/Page_BIG DATA AGENCY/a_Portfolio'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/a_Portfolio'))

WebUI.scrollToElement(findTestObject('portfolio/Page_BIG DATA AGENCY/button_1'), 0)

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_1'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_2'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_3'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_4'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_5'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_6'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_7'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_8'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_9'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_10'))

WebUI.click(findTestObject('Object Repository/portfolio/Page_BIG DATA AGENCY/button_11'))

title = WebUI.getWindowTitle()

WebUI.closeBrowser()

