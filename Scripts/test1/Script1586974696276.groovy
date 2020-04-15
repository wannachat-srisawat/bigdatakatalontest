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

WebUI.openBrowser('https://bda.co.th/')

WebUI.scrollToElement(findTestObject('home/Page_BIG DATA AGENCY/section_BIG DATA                            Solution                        With our big data architecture focused on data liquidity'), 
    0)

WebUI.mouseOver(findTestObject('home/Page_BIG DATA AGENCY/i_Building a competitive advantage with AI NLP and Machine Learning_fa fa-mobile wow fadeInUp'))

WebUI.mouseOver(findTestObject('home/Page_BIG DATA AGENCY/i_Providing IT Service to your business and drives high performance_fa fa-robot wow fadeInUp'))

WebUI.mouseOver(findTestObject('home/Page_BIG DATA AGENCY/i_SOFTWARE INNOVATION SOLUTION_fa fa-pie-chart wow fadeInUp'))

WebUI.mouseOver(findTestObject('home/Page_BIG DATA AGENCY/i_With our big data architecture focused on data liquidity_fa fa-cogs wow fadeInUp'))

WebUI.scrollToElement(findTestObject('home/Page_BIG DATA AGENCY/section_About Us'), 0)

WebUI.mouseOver(findTestObject('home/Page_BIG DATA AGENCY/img_About Us_img-responsive'))

WebUI.scrollToElement(findTestObject('home/Page_BIG DATA AGENCY/section_awards'), 0)

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_1'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_2'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_3'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_4'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_5'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_6'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_7'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_8'))

WebUI.click(findTestObject('home/Page_BIG DATA AGENCY/button_9'))

WebUI.closeBrowser()

