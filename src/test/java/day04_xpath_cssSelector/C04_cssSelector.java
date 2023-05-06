package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_cssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        //6- Gift Cards sekmesine basin
        //7- Birthday butonuna basin
        //8- Best Seller bolumunden ilk urunu tiklayin
        //9- Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //11-Sayfayi kapatin

        driver.get("https://www.amazon.com/"); // <- Adim 2
        driver.manage().window().fullscreen(); // <- Adim 3
        driver.navigate().refresh(); // <- Adim 4

        String expectedIcerik = "Spend less"; // <- Adim 5
        String actualTittle = driver.getTitle();

        if (actualTittle.contains(expectedIcerik)) {
            System.out.println("Sayfa basligi 'Spend less' iceriyor test PASSED");
        } else {
            System.out.println("Sayfa basligi 'Spend less' icermiyor test FAILED");
        }
        driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click(); // <- Adim 6

        driver.findElement(By.xpath("//img[@alt='Birthday']")).click(); // <- Adim 7

        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image'])[1]")).click(); // <- Adim 8

        driver.findElement(By.xpath("//button[@id='a-autoid-0-announce']")).click();



    }

}
