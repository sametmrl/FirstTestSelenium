package ua.pp.krotov;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPOI
{
    public  WebDriver driver;

    //home
    By home_login=By.id("login-form:signup");
    By about_us=By.linkText("About Us");

    //login
    By counselor=By.id("signup:signup");
    By user=By.id("user_login");
    By username=By.id("username");
    By password=By.id("password");
    By Login=By.name("Login");
    By create_account=By.name("Login");

    By Logout=By.linkText("Logout");


    public  void click_Login_button(){

        try {
            this.driver=new Setup().getDriver();
            driver.findElement(home_login).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public void click_Login_counselor()
    {
        driver.findElement(counselor).click();
    }
    public void click_Login_user()
    {
        driver.findElement(user).click();
    }
    public void Enter_login_data(String uname,String pwd)
    {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pwd);
    }
    public void click_Login()
    {
        driver.findElement(Login).click();
    }
}