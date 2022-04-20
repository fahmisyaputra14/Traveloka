import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Order {
    public WebDriver driver;
    public String URL = "https://www.traveloka.com/id-id/";

    @BeforeMethod
    public void beforeMethod ()
    {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        //Setting the driver to chrome driver
        driver = new FirefoxDriver();
    }

    @Test
    public void Flow ()
    {
        driver.get(URL);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.close();
    }
}
