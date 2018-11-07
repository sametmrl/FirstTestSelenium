package ua.pp.krotov;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Signup
{
    public WebDriver driver;
    @Test
    public void openwebsite() throws InterruptedException
    {
        Setup a= new Setup(driver);
        a.Websiteopen();
        SignupPOI b=new SignupPOI();
        b.click_Login_button();
        BilgiGiris c = new BilgiGiris();
        c.BilgiGiris();
        b.click_Login_counselor();
        
    }
}