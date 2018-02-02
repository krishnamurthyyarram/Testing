package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	public WebElement getUsernameTextbox() {
		WebElement ele= driver.findElement(By.xpath("//*[@id='username']"));
		return ele;
		
	}
	
   // public void getPasswordTextbox() {
    	
    	//driver.get("https://KRYA300:London11@idp.ess.postnord.com/adfs/ls/wia?client-request-id=e074369e-80d5-5000-c7e1-e265375c52c7&username=krishnamurthy.yarram%40postnord.com&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=LoginOptions%3D3%26estsredirect%3d2%26estsrequest%3drQIIAZ2RvW_TQADFfXFqpRUSFRNjh05Uju8jd-eLxHC-8y0MASTaBalyax9xoTnHdhAw8Sd0YmRgQcrIhBhYI3XqABLqBEzAhGBhQmCxMCLe8PTG937vio-GaLwN_4iEnYfQWhQeFl36S_Wljc2nrH3_9rF3ffXhY8Fv31wtAZm2bdWMo6hyTTtzdT5splldVK6ctcNDdxztW1cfN1Fe2Gxxrx1mTfXgJQBnAHwCYNmbc6mR4lhJhKjCWmDCaAoNx5wnMU2RwrGUBCVQixShJA2NjHkstSJaEJUmhDGGE6FTbORIUcYTBrXmlCQacoixEWLEJaeGYqMMZfC8d3EiF-0Ud-bq8lHxrbfeddzvFiz9f2Lxwt8WyEJBGQuzmMJwZLMiPDgoUIhFlpMYjjJs2akfuKqYlflZH3zpX4D-eDDY2PQue1vejz54tvab6BP-_fP5u5_XXj9_sxqYgXe6Fu2qW3d3Jrbk80Y4tFstTDSpj-S8uAGtLu_vHe3stQ8XKnd30qt4jE4CcBIEXwPv1fr_nPEL0&cbcxt=&mkt=&lc=");
		
    //}
    
   public WebElement getPasswordTextbox() {
	 WebElement ele= driver.findElement(By.xpath("//input[@name='pwd']"));
	 return ele;
    	
    }
   public WebElement LoginButton() {
	 WebElement ele = driver.findElement(By.id("loginButton"));
	 return ele;
	 
    	
    }


}
