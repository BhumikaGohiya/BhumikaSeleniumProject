package defaultProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "/Users/bhumikagohiya/Downloads/chromeDriver");
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys("Bhumika");
	    driver.findElement(By.name("inputPassword")).sendKeys("hello111"); // entering wrong password to go to perform negative error validation
	    driver.findElement(By.className("signInBtn")).click();
	    //option 1 
	    //driver.wait(2000); //Synchronization issue that means the page is taking 2sec to load error but we are trying to get immediately
	    
	    //Option 2
	    //Implicit wait -- 5 secs timeout
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // will be applicable to all methods after this hence it'll wait for all methods or actions after this 
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    //Tagname[@attribute="value'] 
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // to clear whatever entered in line 25 at email box
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("8989898989");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".reset-pwd-btn")));
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	    
	    driver.quit();
	    
	}

}
