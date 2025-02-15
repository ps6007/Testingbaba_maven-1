package testingbaba;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.logging.LogEntries;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_checkbox_page;
import pages.Testingbaba_textbox_page;
import propertyutility.PropertyUtility;

public class Testingbaba_checkbox_test extends Baselibrary

{

	Testingbaba_checkbox_page ob;
	@Parameters({ "browser" })
	@BeforeTest
	public void launchtestingbaba(String browser) throws InterruptedException 
	{
		String url = PropertyUtility.getreadproperty("Testingbabaurl");
		if(browser.equalsIgnoreCase("firefox")) {
			 
		     //Initializing the firefox driver (Gecko)
			 FirefoxLaunch();

		  }else if (browser.equalsIgnoreCase("chrome")) { 

			  //Initialize the chrome driver

			  ChromeLaunch();

		  } 
		driver.get(url);
		ob = new Testingbaba_checkbox_page();
		ob.closebtn();
	}

	@Test(priority = 1)

	public void CheckboxTestingBaba_test01() throws Exception

	{
		ob.clickonelements();
		
	}

	@Test(priority = 2)

	public void CheckboxTestingBaba_test02() throws InterruptedException {
		ob.checkbox();

	}

	@Test(priority = 3)

	public void CheckboxTestingBaba_test03() throws InterruptedException 
	{
    ob.mobilecheckbox();

	}

}
