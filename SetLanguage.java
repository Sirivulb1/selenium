package Project1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--lang=es"); //espanol
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get("https://www.facebook.com/");

	}

}
