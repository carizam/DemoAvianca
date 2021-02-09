package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.OpenMenu;
import pages.Schedules;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    public WebDriver driver;
    protected HomePage homePage;
    protected OpenMenu openMenu;
    protected Schedules schedules;
    public static Properties proper;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.avianca.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        openMenu = new OpenMenu(driver);
        schedules = new Schedules(driver);
    }

        public void TestFileBase(){
            try {
                proper = new Properties();
                try (FileInputStream ip = new FileInputStream("C:\Users\carlosivan.ariza\Downloads\DemoAvianca\src\main\resources\config.properties");
                    proper.load(ip);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    @AfterClass
    public void exit(){

        driver.quit();

    }
}