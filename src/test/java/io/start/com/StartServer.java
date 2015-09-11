package io.start.com;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartServer {

public static AndroidDriver<MobileElement> driver;
	
	public void loadApp() throws MalformedURLException, InterruptedException
		{
		
		 File app = new File("C:\\Users\\bkbc011\\Desktop\\apk\\production.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("automationName","appium");
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		 Set<String> contextNames = driver.getContextHandles();
	     for (String contextName : contextNames) {
	       System.out.println(contextName);
	       if (contextName.contains("NATIVE_APP")){
	         driver.context(contextName);
	        Thread.sleep(30000);
	       }
	      }
			





}
}





