import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_DriverKomutlari {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://google.com");

        driver.navigate().back();

        driver.navigate().to("http://amazon.com");
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();

        driver.close();
    }
}
