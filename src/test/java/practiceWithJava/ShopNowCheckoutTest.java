package practiceWithJava;


	
	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class ShopNowCheckoutTest {

	    public static void main(String[] args) throws InterruptedException {
	        // Set the path to chromedriver
	       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");  // Update with your path to chromedriver

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Open ShopNow website
	        driver.get("https://www.flipkart.com");

	        // Verify homepage loads successfully
	        System.out.println("Homepage loaded successfully");

	        // Search and Add to Cart
	        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));//input[@class='Pke_EE']
	      
	       searchBox.sendKeys("laptop");
	        searchBox.sendKeys(Keys.ENTER);
	        
	        

	        // Wait for search results and click on a product
	        driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Book4 Intel Core 5 120U - (16 GB/512 GB SSD/Windows 11 Home) NP750XGK-KS2IN Thin and Li...']")).click();
	        driver.getWindowHandle();
	        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	       // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div._1AtVbE")));
	       // WebElement product = driver.findElement(By.cssSelector("div._1AtVbE"));
	        //product.click();
	        

	        // Add the selected laptop to the shopping cart
	       // WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']")));
	       // addToCartBtn.click();

	        // Navigate to shopping cart and verify item
	        driver.get("https://www.flipkart.com/cart");
	        
	        /*
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-id]")));
	        System.out.println("Item added to cart");

	        // Proceed to Checkout
	        WebElement proceedToCheckoutBtn = driver.findElement(By.xpath("//button[text()='Proceed to Checkout']"));
	        proceedToCheckoutBtn.click();

	        // User Authentication
	        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
	        loginBtn.click();

	        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='text']")));
	        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));

	        usernameField.sendKeys("your_username");  // Replace with your username
	        passwordField.sendKeys("your_password");  // Replace with your password
	        passwordField.sendKeys(Keys.ENTER);

	        // Verify user is logged in
	        try {
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='My Account']")));
	            System.out.println("User logged in successfully");
	        } catch (Exception e) {
	            System.out.println("Login failed");
	        }

	        // Shipping Information
	        WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(By.id("address")));
	        WebElement cityField = driver.findElement(By.id("city"));
	        WebElement stateField = driver.findElement(By.id("state"));
	        WebElement zipCodeField = driver.findElement(By.id("zipCode"));

	        addressField.sendKeys("123 Street");
	        cityField.sendKeys("City");
	        stateField.sendKeys("State");
	        zipCodeField.sendKeys("12345");

	        // Proceed to next step (Payment Information)
	        WebElement continueBtn = driver.findElement(By.xpath("//button[text()='Continue']"));
	        continueBtn.click();

	        // Choose a payment method (credit card)
	        WebElement creditCardOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Credit Card']")));
	        creditCardOption.click();

	        // Review Order
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Order Summary']")));
	        System.out.println("Order summary verified");

	        // Close the browser
	        driver.quit();*/
	    }
	    
	    
		
	}
	
	


