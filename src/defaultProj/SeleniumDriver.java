package defaultProj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class SeleniumDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //Invoking Browser
		//Chrome has - ChromeDriver - Methods  ( like close , navigate, refresh, exit )
		//Firefox  has - Firefox drivers - Methods( same methods like above )
		//ChromeDriver driver= new ChromeDriver();
		
		//chromedrive.exe - file  used to invoke chrome browser 
		//SeleniumManager - library connect to web and download appropriate chrome driver and place in particular path
		//System.setProperty("webdriver.chrome.driver", "/Users/bhumikagohiya/Downloads/chromeDriver");
		//Chrome launch 
		WebDriver driver = new ChromeDriver();
		
		//Firefox launch
		//gecodriver
		//WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		
		//WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.wait(1000);
		driver.close();
		//driver.quit();
	     
	} 

}