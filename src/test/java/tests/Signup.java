package tests;
import Base.Setup;
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
        anasayfaPage.kullaniciadidoldur("john.meral@gmail.com")
                .sifredoldur("john")
                .loginbutonunabas()
                .detailsbutonunabas();

        DetailsPage detailsPage =new DetailsPage();

        detailsPage
                .contactbutonunabas();

    }
}
