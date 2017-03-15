package Project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");	
		driver.findElement(By.name("uid")).sendKeys("mngr3685");					
   driver.findElement(By.name("password")).sendKeys("utUjYv");				
        driver.findElement(By.name("btnLogin")).submit();
        System.out.print("login");
        
        Alert alert = driver.switchTo().alert();
        System.out.print("Switched");
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        
        alert.accept();
        

	}

}
