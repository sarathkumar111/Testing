package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsUsingHover {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //Hovering through mouse using Action Class
        //button[@class='nav-flyout-button nav-icon nav-arrow'])[1]
        driver.findElement(By.cssSelector("button.a-button-text")).click();
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("(//button[@class='nav-flyout-button nav-icon nav-arrow'])[1]"))).build().perform();
      // Composite action class which is used to automate key board actions

        //input[@id='twotabsearchtextbox']

        Actions b = new Actions(driver);
        b.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Shirts").doubleClick();
        b.build().perform();

        

    }
}
