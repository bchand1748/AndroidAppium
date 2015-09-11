package io.start.com;




import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert extends StartServer {


@BeforeTest
public void startApp() throws MalformedURLException, InterruptedException
{
	 loadApp();
}

@Test
public void checkAlert() throws InterruptedException
{
	
System.out.println(driver.getPageSource());


}


}
