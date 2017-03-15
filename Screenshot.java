package Project1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File path = new File("./SC/FB.jpg");
		try{
			FileUtils.copyFile(screenshot, path);
		}
		catch(Exception e)
		{
			System.out.println("File did not save: "+e.getMessage());
			
		}
		
	   
		System.out.println("screenshot taken");
        
        driver.quit();

		
		
		

	}

	}


