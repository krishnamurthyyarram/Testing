package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testlogin {
	
	WebDriver driver;
	@BeforeTest
	public void pre() {
		System.setProperty("webdriver.chrome.driver", "//Users//kmyarram//Documents//Selenium_Automation//chromedriver");
		driver= new ChromeDriver();
		driver.get("http://localhost:9999/actitime");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void login() {
		LoginPage login= new LoginPage(driver);
		login.getUsernameTextbox().sendKeys("admin");
		//login.getUsernameTextbox().sendKeys("admin",Keys.ENTER);
		login.getPasswordTextbox().sendKeys("manager");
		login.LoginButton().click();
		
	}
	@AfterTest
	public void post() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='New']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=\"Please correct all errors in the fields highlighted in red.\"]"));
		System.out.println(ele.getText());
		driver.findElement(By.id("createTasksPopup_cancelBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a/div[text()='USERS']")).click();
		driver.findElement(By.id("createUserDiv")).click();
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Testing");
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Testing1");
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("testing@kk.com");
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Demo");
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("password");
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("password");
		driver.findElement(By.id("userDataLightBox_commitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/span[text()='Testing1, Testing']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userDataLightBox_cancelBtn")).click();
		
		//System.out.println(ele2.getText());
		
		WebElement ele1= driver.findElement(By.id("logoutLink"));
		//ele.click();
		System.out.println(ele1.getText());
		ele1.click();
		System.out.println("Successfully clicked on Cancel Button");
		Thread.sleep(1000);
		driver.close();
	}



}
