package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v137.page.model.WebAppManifest;

public class TraversingOfXpaths {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // Traversing from Parent to child using xpath as well as child to child
        WebElement Button =  driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
        System.out.println(Button.getText());
        // Traversing from child to parent
        WebElement Child = driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[1]"));
        System.out.println(Child.getTagName());

    }
}
