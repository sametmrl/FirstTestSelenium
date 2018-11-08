package Base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Setup {

    public  static WebDriver driver;

    @Step("Selam")
    public  void Websiteopen()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.borland.com/InsuranceWebExtJS/");
    }

   // public Setup(WebDriver driver)
    //{

     //   this.driver=driver;
    //}
    public Setup()
    {
    }
    public WebDriver getDriver()
    {
        return this.driver;
    }

}