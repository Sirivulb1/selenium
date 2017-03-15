package Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);//Creating Variable for Explicit Wait
		driver.get("https://www.facebook.com/");//Invoke site
		
	    //1)Different ways to locate elements
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("bobby.sirivuluri@gmail.com");//Send keys to the User name 
		driver.findElement(By.id("pass")).sendKeys("995162993");//Send keys to password
	driver.findElement(By.id("u_0_q")).click();
		
		
		
		//2)relative and absolute XPATH
		
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");//Invoke site
		driver.findElement(By.className("create-account")).click();
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Bobby");//Relative PATH
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[1]/fieldset/label[2]/input")).sendKeys("12345");//Obsolute XPATH
		
		//3)Different types Of waits   1)Implicit Wait   2)Explicit Wait  3)Fluent wait
		//Implicit wait sets a default time for  WebDriver
		//Explicit wait gives you the options to wait until a desired condition is satisfied
		//Fluent Wait 3 types  search on Internet
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit Wait
		
		driver.findElement(By.className("gsfi")).sendKeys("Expliclit wait");
		
		
		
		
		
	
			
		}


	}


