package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {

    public static void main(String[] args) throws InterruptedException {

//        1. once gerekli ayarlamalari yapip driver objesi olusturmaliyiz
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        2. Amazon sayfasina gidelim.https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        3. Sayfa basligini (title) yazdirin
        System.out.println("Sayfa basligi : " + driver.getTitle());
//        4. Sayfa basliginin “Amazon”icerdigini test edin --> yazilim testi beklenen degerlerin gerceklesip gerceklesmedigini test etmektir.

        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedIcerik)) {
            System.out.println("Title Amazon iceriyor, Test PASSED.");
         } else {
            System.out.println("Title Amazon icermiyor, Test FAILED.");
        }

//        5. Sayfa adresini (url) yazdirin

        System.out.println("Sayfa url : " + driver.getCurrentUrl());

//        6. Sayfa url’inin “amazon”icerdigini test edin.
        expectedIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)) {
            System.out.println("Url amazon iceriyor, URL test PASSED.");
        } else {
            System.out.println("Url amazon icermiyor, URL test FAILED.");
        }
//        7. Sayfa handle degerini yazdirin
        System.out.println("Sayfanin handle degeri : " + driver.getWindowHandle());

//        8. Sayfa HTML kodlarinda “alisveris”kelimesi gectigini test edin
        expectedIcerik = "alisveris";
        String actualPageSource = driver.getPageSource();
        if (expectedIcerik.contains(actualPageSource)) {
            System.out.println("Sayfa kaynak kodlari alisveris iceriyor, Test PASSED.");
        } else {
            System.out.println("Sayfa kaynak kodlari alisveris icermiyor, Test FAILED.");
        }

//        9. Sayfayi kapatin.
        Thread.sleep(1000);
        driver.close();
    }
}
