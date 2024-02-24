import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

    @Test
    void loginTest(){
//        WebDriverManager.chromedriver().setup();
//        WebDriverManager.chromedriver().driverVersion("120.0.6099.109").arm64().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("Users/aniket/Downloads/googlechrome-2.dmg");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mydininglt.compass-usa.com/app/");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
