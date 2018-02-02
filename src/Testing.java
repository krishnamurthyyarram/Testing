import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "//Users//kmyarram//Documents//Selenium_Automation//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("http://localhost:9999/actitime");
		//driver.manage().window().maximize();
		//String s= driver.getTitle();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
		String s= driver.getTitle();
		System.out.println("Titke is :" + s);
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='logoutLink']")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
