package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingToCart {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");
        WebElement Item = driver.findElement(By.xpath("//h4[text() = 'Cauliflower - 1 Kg']"));
        String A = Item.getText();
        System.out.println(A);
        if(A.equals("Cauliflower - 1 Kg")){
            WebElement AddToCart = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[2]"));
            AddToCart.click();
        }
    }
}
