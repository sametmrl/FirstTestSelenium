package ua.pp.krotov;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup{

    public  static WebDriver driver;

    public  void Websiteopen()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.borland.com/InsuranceWebExtJS/");
    }

    public Setup(WebDriver driver)
    {

        this.driver=driver;
    }
    public Setup()
    {
    }
    public WebDriver getDriver()
    {
        return this.driver;
    }

}