package page;

import Base.Setup;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage extends AnasayfaPage {

    public WebDriver driver;

    public DetailsPage(){
        this.driver=new Setup().getDriver();
    }

    @Step("Contact Us Butonuna Bas")
    public DetailsPage contactbutonunabas (){
        driver.findElement(By.id("contact")).click();
        return this;
    }










}
