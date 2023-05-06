package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/"); // <-Adim 1
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Add Element']")).click(); // <-Adim 2

        Thread.sleep(2000);


        WebElement deleteButtonElementi = driver.findElement(By.xpath("//*[text()='Delete']")); // <-Adim 3
        Thread.sleep(2000);

        if(deleteButtonElementi.isDisplayed()){
            System.out.println("Delete button testi PASSED");
        }
        else{
            System.out.println("Delete button testi FAILED");
        }


        deleteButtonElementi.click(); // <-Adim 4
        Thread.sleep(2000);

        WebElement addElementsElementi = driver.findElement(By.xpath("//h3")); // <-Adim 5

        // driver.findElement(By.tagName("h3"));

        if(addElementsElementi.isDisplayed()){
            System.out.println("Add/remove Elements testi PASSED");
        }
        else{
            System.out.println("Add/remove Elements FAILED");
        }

        Thread.sleep(2000);
        driver.close();

    }
}
