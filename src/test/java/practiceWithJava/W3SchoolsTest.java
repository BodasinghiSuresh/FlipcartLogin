package practiceWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3SchoolsTest {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		Thread.sleep(4);
		driver.findElement(By.xpath("//input[@id='filter-exercises-input']")).sendKeys("JavaScript");
		driver.quit();
	}

}
