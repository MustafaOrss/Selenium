package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_Locator_findElement {
    public static void main(String[] args) throws InterruptedException {


        // driver icin gerekli ayarlamalari yap
        System.setProperty("webdriver.chrome.drive","src/resources/chromedriver.exe");

        // webDriver olustur
        WebDriver driver = new ChromeDriver();

        // Window'u maximize yap
        driver.manage().window().maximize();

        // gecikmeler icin maximum gecikme suresi belirle
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon'un anasayfasina git
        driver.get("https://www.amazon.com");

        // arama kutusuna Nutella yazdirip

        /*
            Test otomasyonu yaparken
            bir web elemnti kullanmak istersek 2 seye ihtiyacimiz var
            1- o web elementi benzersiz olarak tarif edebilecegimiz bir locator
            2- bu locator'i soyledigimizde bize web elementi bulup getirecek method

            ornegin amazon sitesindeki arama kutusunun unique tarif edicisi olarak
            id = "twotabsearchtextbox" 'i kullanabiliriz.

        */

       WebElement aramaKutusuElementi =     driver.findElement(By.id("twotabsearchtextbox"));
        // data turu -> objenin adi   =     -> find element: webelementi bulan method
       //                                   -> By : webelementi bulacagimiz locator'in turunu yazdigimiz method
      //                                    -> twotabsearchtextbox : unique tarif icin id attribute degeri

        /*
            findElement() verdigimiz locator turu ve o locator icin verdigimiz degere gore
            webelement'i arar
            locator icin verdigimiz deger hatali ise veya locator stratejisinde hata yaptiysak aranan web elementi
            implicitlyWait olarak tanimladigimiz maximum sure boyunca arar bulamadigi icin "NoSuchElementException" firlatir
            ve kodlarin kalanini calistirmaz

        */

      aramaKutusuElementi.sendKeys("Nutella"); // istenen webelement'e istenen yaziyi gonderir

     // Enter tusuna basarak arama yap

    aramaKutusuElementi.submit(); // istenen web elementi uzerinde enter tusuna basar


        Thread.sleep(7000);
        driver.close();

    }
}
