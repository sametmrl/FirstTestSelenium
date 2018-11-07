package ua.pp.krotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class BilgiGiris extends Setup {




    public  void BilgiGiris()
    {
        for (int i=1; i<=1; i++)


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

    }


}
