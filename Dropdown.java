package Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://uk.webuy.com");
		driver.findElement(By.xpath(".//*[@id='stext']")).sendKeys("iphone");
		driver.findElement(By.xpath(".//*[@id='headersearch']/input")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[1]/div[3]/div/a[2]/div/span")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[2]/div[3]/div/a[2]/div/span")).click();
		driver.findElement(By.className("basketTableCell")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div[2]/table/tbody/tr/td[2]/a[1]")).click();
		//driver.findElement(By.className("buybasket")).click();
		
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[2]/td[5]/a/img"));
		
		Select dropdown = new Select(driver.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[1]/div/select")));
		dropdown.selectByIndex(0);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit Wait
		dropdown.selectByIndex(1);
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit Wait
		dropdown.selectByIndex(2);
		
		
		driver.get("http://spicejet.com/");
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		Select dropdown1= new Select(driver.findElement(By.xpath("//select [@id='ctl00_mainContent_ddl_Adult']")));
		dropdown1.selectByIndex(8);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dropdown1.selectByIndex(4);

		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		//System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")));


		//driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Butter']")).click();
		//int index=driver.findElements(By.xpath("//input[@name='group1']")).size();*//

		//for(int i=0;i<index;i++)
		//{
			//driver1.findElement(By.xpath("//input[@value='Butter']")).get
			//}




	}

}
