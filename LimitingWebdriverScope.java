package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebdriverScope {
    public static void main(String[] args) throws InterruptedException {
        // limiting webdriver scope means we are creating separate sub webdriver which is dedicated
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
       // driver.findElement(By.cssSelector("button.a-button-text")).click();
       System.out.println(driver.findElements(By.tagName("a")).size());

       // creating another webdriver which is only useful for footer section

        WebElement FooterDriver = driver.findElement(By.cssSelector("div._1ZMrY_"));
        System.out.println(FooterDriver.findElements(By.tagName("a")).size());

        Thread.sleep(10000);

        driver.quit();


    }
}
