package ua.pp.krotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;



public class FirstTest  {
    String url = "\"https://demo.borland.com/InsuranceWebExtJS/";



    WebDriver driver = new ChromeDriver();

    @Test // Marking this method as part of the test
    public void SiteyeGirs() {
        // Go to the Wikipedia home page
        for (int i=1; i<=1; i++)
            System.setProperty("webdriver.chrome.driver", "C:\\driver");
        driver.manage().window().maximize();
        driver.get("https://demo.borland.com/InsuranceWebExtJS/");
        driver.findElement(By.id("login-form:signup")).click();
        driver.findElement(By.id("signup:fname")).sendKeys("BatuhanUmutSamet");
        driver.findElement(By.id("signup:lname")).sendKeys("OptiimTest");
        driver.findElement(By.id("BirthDate")).sendKeys("12/01/2000");

        WebElement email=driver.findElement(By.id("signup:email"));
        email.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys("username"+randomInt+"@gmail.com");




        WebElement mailing=driver.findElement(By.id("signup:street"));
        mailing.click();
        Random randomGeneratorr = new Random();
        int randomIntt = randomGeneratorr.nextInt(1000);
        mailing.sendKeys("username"+randomIntt+"@gmail.com");




        driver.findElement(By.id("signup:street")).sendKeys("Avcılar");
        driver.findElement(By.id("signup:city")).sendKeys("İstanbul");
        driver.findElement(By.id("signup:state")).sendKeys("California");
        driver.findElement(By.id("signup:zip")).sendKeys("34347");
        driver.findElement(By.id("signup:password")).sendKeys("13271327");
        driver.findElement(By.id("signup:signup")).click();
        driver.findElement(By.id("signup:continue")).click();
        driver.findElement(By.partialLinkText("Home")).click();
        driver.findElement(By.id("logout-form:details")).click();
    }

}

