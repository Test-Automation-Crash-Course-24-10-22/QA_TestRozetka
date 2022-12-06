package com.rozetka.testCaseOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {
    static WebDriver driver;
    public TestPage(WebDriver webDriver){this.driver=webDriver;}

    public static By buttonPersonalOffice = By.xpath("//button[contains(text(),'Увійдіть в особистий кабінет')]");
    public static By buttonRegister = By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']");
    public static By userName = By.xpath("//input[@id='registerUserName']");
    public static By userSurname = By.xpath("//input[@id='registerUserSurname']");
    public static By userPhone = By.xpath("//input[@id='registerUserPhone']");
    public static By userEmail = By.xpath("//input[@id='registerUserEmail']");
    public static By userPassword = By.xpath("//input[@id='registerUserPassword']");
    public static By userButtonRegister = By.xpath("//button[contains(text(),'Зареєструватися')]");

    public static void openRegisterForm(){
        driver.findElement(buttonPersonalOffice).click();
        driver.findElement(buttonRegister).click();
    }
    public static void fillName(String name){
        driver.findElement(userName).sendKeys(name);
    }
    public static void fillSurname(String surname){
        driver.findElement(userSurname).sendKeys(surname);
    }
    public static void fillPhone(String number){
        driver.findElement(userPhone).sendKeys(number);
    }
    public static void fillEmail(String email){
        driver.findElement(userEmail).sendKeys(email);
    }
    public static void fillPassword(String password){
        driver.findElement(userPassword).sendKeys(password);
    }
    public static void confirmRegisterForm(){
        driver.findElement(userButtonRegister).click();
    }
}
