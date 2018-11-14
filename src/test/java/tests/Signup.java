package tests;
import Base.Setup;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;
import page.AnasayfaPage;
import page.DetailsPage;
import pages.SignupPOI;

public class Signup
{
    //public WebDriver driver;
    @Test
    public void openwebsite() throws InterruptedException
    {
        Setup a= new Setup();
        a.Websiteopen();
        AnasayfaPage anasayfaPage = new AnasayfaPage();
        anasayfaPage.kullaniciadidoldur("john.smith@gmail.com")
                .sifredoldur("john")
                .loginbutonunabas()
                .detailsbutonunabas();
        Allure.addAttachment("OPTİİM","TEST EKİBİ İNNOVATİON İNCLUDED!");

        DetailsPage detailsPage =new DetailsPage();

        detailsPage
                .contactbutonunabas();
    }
}