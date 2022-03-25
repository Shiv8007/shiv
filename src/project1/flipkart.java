package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
    public static void main (String[] args)throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.flipkart.com/");
    	Thread.sleep(2000);
    	WebElement Grocery=driver.findElement(By.xpath("//div[contains(.,'Grocery')]"));
        Grocery.click();
        System.out.println("Grocery.getText()");
    }
}
