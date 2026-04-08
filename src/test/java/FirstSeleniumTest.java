import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver  driver;

    //before-> setUp
    @BeforeMethod
    public void setUP(){
        WebDriverManager.chromedriver().browserVersion("146").setup();
        driver =new ChromeDriver();
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //test->
    @Test
    public void openGoogle(){
        System.out.println("Hello");

    }
    //after->tearDown
    @AfterMethod
    public void tearDown(){
        driver.quit();// All tabs close Browser
        driver.close();// Only one tab (if only one -> close browser
    }
}
