package TestCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

import java.time.Duration;


public class LoginEnter  {

    private WebDriver driver;
    private LoginPage loginPage;



@BeforeMethod
private void SetUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    loginPage = new LoginPage(driver);



    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.saucedemo.com");

    }

    @Test
    public void successfulLoginTest() {

    loginPage.open();
        assertTrue(loginPage.atPage());
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

    }

    @Test
    public void wrongPasswordLoginTest() {

    loginPage.open();
        assertTrue(loginPage.atPage());
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

    }

    @Test
    public void wrongLoginNameLoginTest() {
        driver.get("https://saucedemo.com");
        driver.findElement(By.id("//*[@id=\"user-name\"]")).sendKeys("test");
        driver.findElement(By.id("//*[@id=\\\"password\\\"]\"")).sendKeys("test");
        assertEquals("Home Page", driver.getTitle());
    }

}