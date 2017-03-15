
package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitColse {

	
		public static void usingClose() {
			System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
			System.out.println(driver.getTitle());
			//doesn't close child pages
			driver.close();
		 }
		public static void usingQuit(){
			System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath(".//*[@id='social_block']/ul/li[2]/a")).click();
			System.out.println(driver.getTitle());
			// closes all the pages
			driver.quit();
		}

		public static void main(String[] args) {
			usingClose();
			usingQuit();
		}

	}


