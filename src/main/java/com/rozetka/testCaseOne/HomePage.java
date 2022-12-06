package com.rozetka.testCaseOne;

import org.openqa.selenium.WebDriver;

public class HomePage {
    static WebDriver driver;

    public HomePage(WebDriver webDriver){this.driver=webDriver;}

    public static void openHomePage(){ driver.get("https://rozetka.com.ua/ua/");}

}
