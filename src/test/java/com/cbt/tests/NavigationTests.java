package com.cbt.tests;

import com.cbt.utilities.Driver;
import com.cbt.utilities.StringUtilities;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NavigationTests {

    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //go to website: https://google.com
        driver.get("https://google.com");
        String googleTitle=driver.getTitle();

        driver.get("https://etsy.com");
        String etsyTitle=driver.getTitle();

        driver.navigate().back();

        String googleTitle2=driver.getTitle();

        StringUtilities.verifyEquals(googleTitle,googleTitle2);

        driver.navigate().forward();

        String etsyTitle2=driver.getTitle();

        StringUtilities.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();

        System.out.println("--------------------------------");


         WebDriver driver2=Driver.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //go to website: https://google.com
        driver.get("https://google.com");
        String googleTitleFirefox=driver.getTitle();

        driver.get("https://etsy.com");
        String etsyTitleFirefox=driver.getTitle();

        driver.navigate().back();

        String googleTitleFirefox2=driver.getTitle();

        StringUtilities.verifyEquals(googleTitle,googleTitle2);

        driver.navigate().forward();

        String etsyTitleFirefox2=driver.getTitle();

        StringUtilities.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();


        System.out.println("----------------------------");

       WebDriver driver3=Driver.getDriver("edge");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //go to website: https://google.com
        driver.get("https://google.com");
        String googleTitleEdge=driver.getTitle();

        driver.get("https://etsy.com");
        String etsyTitleEdge=driver.getTitle();

        driver.navigate().back();

        String googleTitleEdge2=driver.getTitle();

        StringUtilities.verifyEquals(googleTitle,googleTitle2);

        driver.navigate().forward();

        String etsyTitleEdge2=driver.getTitle();

        StringUtilities.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();

    }

















}
