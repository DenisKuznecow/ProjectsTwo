package TestCart;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;



public class LoginPage{
    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;


    }

    void enterUserName(String name) {
        driver.findElement(By.id("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    }

    void enterPassword(String pass) {
        driver.findElement(By.id("//*[@id=\\\"password\\\"]\"")).sendKeys("secret_sauce");
    }

    void clickLogin() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
    }



    void open() {
        driver.get("https://www.saucedemo.com");
    }


    public boolean atPage() {
        if (driver.getTitle().equals("https://www.saucedemo.com")) {
            return true;
        } else {
            return false;
        }
    }
    }
