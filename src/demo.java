public class Urbanladder {
	public static void main(String []args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Urbanladder.com/");
		Thread.sleep(2000);
		webElement sale =driver.findElement(By.xpath("//li/span[contains(.,'Sale')]"));
		sale..click();
		System.out.println("sale.getText()");
		
	}
}