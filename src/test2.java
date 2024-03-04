import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class test2 {
	DesiredCapabilities caps = new DesiredCapabilities();
	AndroidDriver driver;

	@BeforeTest
	public void myBeofreTesting() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "batt");
		caps.setCapability("chromedriverExecutable","C:\\Program Files (x86)\\chromedriver_win32 (1)");
	File app=new File("src/APP/calculator.apk");	
	caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	}

	@Test()
	public void testone() throws MalformedURLException {
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	}

	@AfterTest
	public void endTesting() {
	}
}
