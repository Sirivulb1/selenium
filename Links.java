package Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		d.navigate().to("http://www.thehindu.com/");
		Actions action = new Actions(d);
		WebElement k = d.findElement(By.xpath(".//*[@id='main-menu']/ul/li[5]/a"));
		action.moveToElement(k).build().perform();
		d.findElement(By.xpath(".//*[@id='main-menu']/ul/li[5]/ul/li[4]/a")).click();
		java.util.List<WebElement> links = d.findElements(By.tagName("a"));
		 
		System.out.println(links.size());
 
		for (int i = 1; i < links.size(); i=i+1)
 
		{
 
			System.out.println(links.get(i).getText());
			
		}
		Actions action1 = new Actions(d);
		WebElement Y = d.findElement(By.xpath(".//*[@id='section_2']/div[1]/div/h2"));
		action1.moveToElement(Y).perform();
		
		d.findElement(By.xpath(".//*[@id='section_2']/div[2]/div/div/div[2]/div/div/div")).click();
		d.findElement(By.xpath(".//*[@id='main-menu']/ul/li[6]/a")).click();
		java.util.List<WebElement> Links1  = d.findElements(By.tagName("a"));
		
		System.out.println(Links1.size());
		
		for(int j=1; j < Links1.size(); j=j+1)
		{
			System.out.println(Links1.get(j).getText());
		}
		d.close();
		}


	}


