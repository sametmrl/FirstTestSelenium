package page;

import Base.Setup;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnasayfaPage {

    public WebDriver driver;

    public AnasayfaPage(){
        this.driver=new Setup().getDriver();
    }

    @Step("Kulanıcı Adı Doldurma")
    public AnasayfaPage kullaniciadidoldur(String username){
        driver.findElement(By.id("login-form:email")).sendKeys(username);
        return this;
    }

    @Step("Şifreyi Doldurma")
    public AnasayfaPage sifredoldur(String username){
        driver.findElement(By.id("login-form:password")).sendKeys(username);
        return this;
    }

    @Step("Login Butonuna Bas")
    public AnasayfaPage loginbutonunabas(){
        driver.findElement(By.id("login-form:login")).click();
        return this;
    }


    @Step("Details Butonuna Bas")
    public AnasayfaPage detailsbutonunabas(){
        driver.findElement(By.id("logout-form:details")).click();
        return this;
    }














}
