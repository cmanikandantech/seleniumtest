
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
public class App
{
 @Test

 public static void main(String[] args) {


 System.setProperty("webdriver.gecko.driver","/home/edureka/geckodriver");
 //ChromeOptions chromeOptions = new ChromeOptions();
 //WebDriver driver = new ChromeDriver(chromeOptions);
 
 FirefoxOptions options = new FirefoxOptions();
 WebDriver driver = new FirefoxDriver(options);

 System.out.println("Hi, Welcome to Edureka's Case Study on Selenium WebDriver");


 driver.get("http://localhost:3001");

 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.findElement(By.name("login")).sendKeys("devops");
 driver.findElement(By.name("password")).sendKeys("test");
 driver.findElement(By.name("click")).click();
 //Thread.sleep(5000);
 driver.quit();
 }

}
