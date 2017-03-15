package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("lavanya41c@gmail.com");
		driver.findElement(By.id("next")).click();
		// steps to find checkbox checked
		boolean ischecked;
		ischecked = driver.findElement(By.id("PersistentCookie")).isSelected();
		System.out.println(" CheckBox checked? : "+ischecked);
		driver.close();

	}

}
