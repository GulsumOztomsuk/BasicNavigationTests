package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StringUtilities {

    public static void verifyEquals(String actualResult, String expectedResult){

        Assert.assertEquals(actualResult, expectedResult);

        if (actualResult.equals(expectedResult)){
            System.out.println("PASS");
        }else {
            System.out.println("FAİL");
        }

    }
}
