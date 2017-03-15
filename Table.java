package Project1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.espncricinfo.com/india-v-new-zealand-2016-17/engine/match/1030217.html");
		driver.findElement(By.xpath(".//*[@id='st_1']")).click();
		WebElement table= driver.findElement(By.className("batting-table innings"));
		//to find the no. of rows in the table
		List<WebElement> tabletags=(table.findElements(By.tagName("tr")));
		System.out.println("Totalnoofrows"+tabletags);
		
		
		
		
		
		
		
		

	}

}
