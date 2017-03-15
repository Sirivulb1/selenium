package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		

		// If you want to accees any methods in class ,create object for that class and access methods

		//using object.method

		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

		dropdown.selectByIndex(4);
		
		Thread.sleep(5000);

		dropdown.selectByVisibleText("9 Adults");
		
		Thread.sleep(5000);

		dropdown.selectByValue("8");

		/*System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());*/

	}

}
