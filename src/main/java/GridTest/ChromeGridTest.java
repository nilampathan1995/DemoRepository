package GridTest;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		String huburl="http://192.168.66.1:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(huburl),options);
		
		driver.get("https://www.amazon.com/");
		driver.getTitle();
	}

}
