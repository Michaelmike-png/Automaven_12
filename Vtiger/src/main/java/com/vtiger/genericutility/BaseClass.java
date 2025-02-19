package com.vtiger.genericutility;

import java.io.IOException;
import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;
import com.vtiger.objectrepository.HomePage;
import com.vtiger.objectrepository.LoginPage;

public class BaseClass {
	public static ExtentReports extReport;
	public static WebDriver driver;
	
	public static ExtentTest test;
	public JavaUtility jutil=new JavaUtility();
	public FileUtility fUtil=new FileUtility();
	public ExcelUtility eutil=new ExcelUtility();
	
	public WebDriverUtility wUtil=new WebDriverUtility();
	public LoginPage lp;
	public HomePage hp;
	
	
	@BeforeSuite
	public void reportConfig() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/ExtentReport"+jutil.getSystemString()+".html");
		extReport=new ExtentReports();
		extReport.attachReporter(spark);
		
	}
	@BeforeClass
	public void openBrwoser(@Optional("chrome")String browserName) throws IOException {
		
	if(browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}else if(browserName.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(fUtil.getDataFromProperty("url"));
	}
	
	@BeforeMethod
	
	public void login() throws IOException {
		lp=new LoginPage(driver);
		lp.getUserNameTextfield().sendKeys(fUtil.getDataFromProperty("UserName"));
		lp.getPasswordTextField().sendKeys(fUtil.getDataFromProperty("Password"));
		lp.getLoginButton().click();
	
	}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
		wUtil.mouseHover(driver,hp.getProfilicon());
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@AfterSuite
	public void  reportBackup() {
		( extReport).flush();
	}
}
	






	




