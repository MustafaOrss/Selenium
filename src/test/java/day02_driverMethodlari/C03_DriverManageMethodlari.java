package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*

        Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi
        kodlar calismaya basladiginda biz driver icin yol gostermez isek
        Selenium kendi driver'ini devreye sokuyor
        Ama baslangicta driver ayari aradigi icin biraz yavas calisir.

            driver.manage().window().istenen ayar ile window'umuzu istedigimiz boyuta getirebilir
            veya window'un konum ve buyukluk bilgilerine ulasabiliriz

            Biz genelde bir teste baslamadan once
            window'u maximize yapmayi tercih ederiz

        */



        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // implicitlyWait bir web sayfasi acilincaya veya aradigimiz elementler bulununcaya kadar
        // bekleyecegi maximum sureyi belirler


        driver.get("https://www.amazon.com");

        System.out.println("Baslangicta konum : "+driver.manage().window().getPosition());
        System.out.println("Baslangicta boyut : "+driver.manage().window().getSize());

        Thread.sleep(1000);
        driver.manage().window().maximize();

        System.out.println("Maximize konum : "+driver.manage().window().getPosition());
        System.out.println("Maximize boyut : "+driver.manage().window().getSize());

        Thread.sleep(1000);

        driver.manage().window().fullscreen();

        System.out.println("Fullscreen konum : "+driver.manage().window().getPosition());
        System.out.println("Fullscreen boyut : "+driver.manage().window().getSize());

        driver.manage().window().minimize();

        System.out.println("Minimize konum : "+driver.manage().window().getPosition());
        System.out.println("Minimize boyut : "+driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500, 500));

        System.out.println("Istenilen konum : "+driver.manage().window().getPosition());
        System.out.println("Istenilen boyut : "+driver.manage().window().getSize());



        Thread.sleep(3000);
        driver.close();

        // Bazi web sayfalarinda maximize yapilmaz ise butonlar gorunur olmayabilir
        // bunun sonucunda istenilen test yapilamayabilir.

    }
}
