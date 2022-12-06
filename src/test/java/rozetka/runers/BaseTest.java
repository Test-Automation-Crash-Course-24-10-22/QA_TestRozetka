package rozetka.runers;

import com.rozetka.testCaseOne.HomePage;
import com.rozetka.testCaseOne.TestPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected TestPage testPage;
    protected HomePage homePage;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        testPage = new TestPage(driver);
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
