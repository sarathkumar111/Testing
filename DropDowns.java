package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
        Select obj = new Select(dropdown);
        obj.selectByIndex(1);
        //obj.deselectByIndex(1);
       // Thread.sleep(Long.parseLong("50000"));
       driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
       Thread.sleep(Long.parseLong("5000"));
       for(int i =0;i<5;i++) {
           driver.findElement(By.id("hrefIncAdt")).click();
       }
       int i =1;
       while(i<2){
           driver.findElement(By.id("hrefIncAdt")).click();
           i++;
       }

    // Handling Dynamic dropdowns

        WebElement From = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
        From.click();
        WebElement FromCity = driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']"));
        FromCity.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong("5000")));

        //WebElement To = driver.findElement(By.xpath("(//a[@value='TIR'][1])"));
        WebElement To = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@value='TIR'])[2]")));
        To.click();

        //Handling Calendar

        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();







    }
}
