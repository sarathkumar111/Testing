package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        // Handling frames
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        // dragging and dropping using actions class
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        a.dragAndDrop(source, target).build().perform();



        // reverting back to the normal without dragging

        Thread.sleep(5000);

        // Refreshing a page

        // After performing the operations with frames we need to come out of frames

        driver.switchTo().defaultContent();

        driver.navigate().refresh();







    }
}
