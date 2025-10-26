package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        // Handling multiple windows in a set
        Set<String> windowHandles = driver.getWindowHandles(); // used to get IDs of a set
        // conversion of set to list for accessing IDs using index
        List<String> windows = new ArrayList<>(windowHandles);

        for(String i : windows){
            System.out.println(i);

        }

        // switching to child window
        Thread.sleep(5000);

        driver.switchTo().window(windows.get(1));
        WebElement Email = driver.findElement(By.linkText("mentor@rahulshettyacademy.com"));
        System.out.println(Email.getText());

        WebElement Paragraph = driver.findElement(By.cssSelector("p.im-para.red"));
         String ParagraphText = Paragraph.getText();
         System.out.println(ParagraphText);

         // Extracting only Email ID from Paragraph using Split

        String ParagraphTextSplit = Arrays.toString(new String[]{Arrays.toString(new String[]{ParagraphText.split("at")[1].trim().split(" ")[0]})});

        System.out.println(ParagraphTextSplit);


        String EmailData = Email.getText();
        Thread.sleep(5000);
        // switching to parent windows

        driver.switchTo().window(windows.get(0));

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(EmailData);


        Thread.sleep(10000);
        driver.quit();












    }
}
