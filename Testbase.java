package com.myntra.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static WebDriver driver;
public static Properties prop;
public Testbase() {
	try {
		prop = new Properties();
		FileInputStream fis=new FileInputStream("E:\\parallel project\\myntra\\src\\main\\java\\com\\myntra\\config\\config.properties");
		prop.load(fis);
	}
	catch(IOException e) {
		e.getMessage();
	}
}
public static WebDriver browserInitialization() {
	prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	 driver.get(prop.getProperty("url"));
	return driver;
}

}