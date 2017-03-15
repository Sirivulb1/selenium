package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		  WebDriver driver=new ChromeDriver();
		   driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		 
		   Actions build =new Actions(driver);
		  
		  WebElement From=driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div[2]/div/div/div[1]/div/div[1]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[2]/table/tbody/tr/td[4]/span"));
		  //James Johns
		  WebElement to = driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div[2]/div/div/div[1]/div/div[2]/div/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span"));
		  
		 build.dragAndDrop(From, to).build().perform();
		  
	}

}
