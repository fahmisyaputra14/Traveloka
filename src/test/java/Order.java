import org.openqa.selenium.By;
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
    public void Flow () throws InterruptedException {
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div[1]/div/div/div[1]/div/div/div[1]/div/div[2]")).click();
        Thread.sleep(14000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div[1]/input")).sendKeys("Padang");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/div/div[3]/div/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]/input")).click();

//        String Dari_expected = "Jakarta";
//        String Dari_actual = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/input")).getText();
//        //WebElement dari = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/input"));
//        if (Dari_actual == Dari_expected)
//        {
//            driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div[1]/input")).sendKeys("Pad");
//
//        }
        Thread.sleep(4000);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.close();//close browser
    }
}
