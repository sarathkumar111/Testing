package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Synchronization {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebElement AddToCart = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
        AddToCart.click();
        driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        //implicit wait example
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Explicit wait example
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(By.cssSelector("input.promoCode")).sendKeys("sarath");
        // Fluent Wait

        //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
                //.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        //wait.until()





    }
}
