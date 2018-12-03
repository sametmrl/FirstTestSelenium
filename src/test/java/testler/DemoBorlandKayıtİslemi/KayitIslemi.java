package testler.DemoBorlandKayıtİslemi;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import page.AnasayfaPage;
import page.DetailsPage;

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'set'
            }
        }
    }
}

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
    }
}
@Feature("Antet İşlemleri")
public class KayitIslemi {


    public WebDriver driver;

DetailsPage detailsPage= new DetailsPage();


    @Test(description = "Anasayfa İşlemleri")
    public void denemeTest(){

        AnasayfaPage d = new AnasayfaPage();
        driver = d.driver;
        driver.get("https://demo.borland.com/InsuranceWebExtJS/");
        Allure.addAttachment("OPTİİM","TEST EKİBİ İNNOVATİON İNCLUDED!");
        d.kullaniciadidoldur("john.smith@gmail.com");
        d.sifredoldur("john");
        d.loginbutonunabas();
        d.detailsbutonunabas();
    }

    @Test(description = "Details İşlemleri")
    public void DetailsTest() {

        detailsPage.contactbutonunabas();

    }
}
