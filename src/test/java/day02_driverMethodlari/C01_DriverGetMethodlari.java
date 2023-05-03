package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");

        // yukarida ki kod webdriver'in ne olacagini ve bu driver'in hangi dosya yolunda oldugunu soyler

        WebDriver driver = new ChromeDriver();

        // yukaridaki kod bilgisayarimizdaki chrome browser'in otomasyonla calisacak bir kopyasini olusuturur
        // Chrome disinda bir browser kullanmak istersek o browser'in driver'ini indirip
        //System.setProperty("webdriver.safari.driver","safari driver'in dosya yolu buraya yazilacak");
        // Olusturdugumuz driver objesi bizim elimiz ve gozumuz gibidir!

        driver.get("https://www.amazon.com/"); // istenilen URL'yi browser'da acar (www yazmazsak da calisir https:// yazmaz isek calismaz

        System.out.println(driver.getTitle()); // gidilen adresin Title kismini bize dondurur
        // Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl()); // gidilen adresin URL'sini dondurur
        // https://www.amazon.com/

        System.out.println(driver.getWindowHandle());  // acilan her pencereye verilen unique hash code degerini bize dondurur
        System.out.println(driver.getWindowHandles());// eger driver calisirken birden fazla pencere veya tab olusturduysa
        // acilan tum windows veya tab'lerin unique hash code'larini bir set olarak bize dondurur.

        Thread.sleep(1000); // mili saniye olarak yazdigimiz sayi suresince kodu bekletir.
        driver.close(); // acilan browser'i kapatir.


    }
}
