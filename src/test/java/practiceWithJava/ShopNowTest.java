package practiceWithJava;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopNowTest {

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	}

	@Test
	public void verifyHomePage() {

		// Verify that the homepage loads successfully
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(expectedTitle.equals(actualTitle));
	}

	@Test
	public void searchAndAddToCart() throws Exception {

		// Type "laptop" in the search bar and press Enter
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("laptop");
		searchBox.submit();

		// Wait for search results to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement laptopLink = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='CXW8mj']//img")));

		// Click on one of the search results to view the product details
		laptopLink.click();

		String mainWindow = driver.getWindowHandle();
		Set<String> childWindowIds = driver.getWindowHandles();

		for (String child : childWindowIds) {
			if (!child.equals(mainWindow)) {
				driver.switchTo().window(child);
			}
		}

		// Wait for product details page to load
		WebElement addToCartButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add to cart']")));

		// Add the selected laptop to the shopping cart
		addToCartButton.click();

		// Wait for the cart confirmation message
		WebElement cartConfirmationMessage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Place Order']")));

		String actualQuantity = "1";
		String expectedQuantity = driver.findElement(By.xpath("//input[@class='_253qQJ']")).getAttribute("value");
		Assert.assertEquals(actualQuantity, expectedQuantity);

		driver.findElement(By.xpath("//span[normalize-space()='Place Order']")).click();

		WebElement contineBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='CONTINUE']")));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sachindm501@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='CONTINUE']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("9611443235");

		driver.findElement(By.xpath("//span[normalize-space()='CONTINUE']")).click();
		Thread.sleep(18000);
		// driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh
		// _17N0em']")).sendKeys("691236");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
