package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.HomePage;
import utility.BaseClass;
import utility.ExtentReports_;
import utility.SnapShots;

public class TestExecution extends BaseClass {
	
	BaseClass baseclass;
	HomePage homepage;
	ExtentReports_ reports;
	SnapShots snap;
	
	@BeforeClass
	public void beforeClass() {
		reports=new ExtentReports_();
		reports.creatReport();
		reports.createTest("Marriott test");
	}
	@BeforeMethod
	public void before() {
		baseclass=new BaseClass();
		baseclass.setup();
		driver.get(url);
		homepage=new HomePage();
		snap=new SnapShots();
		reports.logPass("browser opened successfully");
		
	}
	
	@Test
	public void t() {
		homepage.clickOnMenu();
		//homepage.clickOnFindAndRes();
		snap.takeSnapShot("Marriott 1");
		reports.logPass("test 1 passed");
	}
	
	@Test
	public void t1() {
		homepage.clickOnMenu();
		//homepage.clickOnFindAndRes();
		snap.takeSnapShot("Marriott 1");
		reports.logPass("test 2 passed");
	}
	
	@AfterMethod
	public void after() {
		baseclass.teardown();
		reports.logPass("browser terminatted successfully");
	}
	
	@AfterClass
	public void afterClass() {
		reports.closeTest();
		reports.closeReport();
	}
}
