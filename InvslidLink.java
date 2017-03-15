package Project1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvslidLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.applicoinc.com");
		  
		  
		  List<WebElement> ele = driver.findElements(By.tagName("a"));
	        System.out.println("size:" + ele.size());
	        boolean isValid = false;
	        for (int i = 0; i < ele.size(); i++) {

	            //isValid = getResponseCode(ele.get(i).getAttribute("href"));
	            if (isValid) {
	                System.out.println("ValidLinks:" + ele.get(i).getAttribute("href"));
	                driver.get(ele.get(i).getAttribute("href"));
	                List<WebElement> ele1 = driver.findElements(By.tagName("a"));
	                System.out.println("InsideSize:" + ele1.size());
	                for (int j=0; j<ele1.size(); j++){
	                    //isValid = getResponseCode(ele.get(j).getAttribute("href"));
	                    if (isValid) {
	                        System.out.println("ValidLinks:" + ele.get(j).getAttribute("href"));
	                    }
	                    else{
	                        System.out.println("InvalidLinks:"+ ele.get(j).getAttribute("href"));
	                    }
	                }

	                } else {
	                    System.out.println("InvalidLinks:"
	                            + ele.get(i).getAttribute("href"));
	                }

	            }
	        }

		


	}


