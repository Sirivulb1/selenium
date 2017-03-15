package Project1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Saucelab {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= DesiredCapabilities.firefox();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");
		
		WebDriver driver = new RemoteWebDriver(
                new URL("http://bobby4A51987:a8629fa0-754b-4c3f-96b7-ee3b76a6332b@ondemand.saucelabs.com:80/wd/hub"),
                dc);
		
		driver.get("http://ebay.com");
		System.out.println(driver.getTitle());
		
		

	}

}
