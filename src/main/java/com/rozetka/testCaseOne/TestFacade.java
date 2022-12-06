package com.rozetka.testCaseOne;

import org.openqa.selenium.WebDriver;

public class TestFacade {

    public WebDriver driver;

    private static TestPage testPage;
    private  HomePage homePage;

    // Builder
    private static String name;
    private static String surname;
    private static String phone;
    private static String email;
    private static String password;

    // Getter
    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getPhone() {
        return phone;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }
    //Getter end
    public static class Builder{
        private TestFacade newTestFacade;

        public Builder(){
            newTestFacade = new TestFacade();
        }

        public Builder fillName(String name){
            newTestFacade.name = name;
            return this;
        }
        public Builder fillSurname(String surname){
            newTestFacade.surname=name;
            return this;
        }
        public Builder fillPhone(String phone){
            newTestFacade.phone=phone;
            return this;
        }
        public Builder fillEmail(String email){
            newTestFacade.email=email;
            return this;
        }
        public Builder fillPassword(String password){
            newTestFacade.password=password;
            return this;
        }

        public TestFacade build(){
            return newTestFacade;
        }
    }
    //Builder end

    public class OpenSignUpForm {
        public void open(){
            homePage.openHomePage();
            testPage.openRegisterForm();
        }
    }
    public class FillRegisterForm {
        public static void fillRegisterForm(){
            testPage.fillName(name);
            testPage.fillSurname(surname);
            testPage.fillPhone(phone);
            testPage.fillEmail(email);
            testPage.fillPassword(password);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //testPage.confirmRegisterForm();
        }
    }


    public class Interface{
        private OpenSignUpForm openForm;
        private FillRegisterForm fillRegisterForm;


        public Interface() {
            this.openForm = new OpenSignUpForm();
            this.fillRegisterForm = new FillRegisterForm();

        }
        public void successfulTest() throws InterruptedException {
            openForm.open();
            fillRegisterForm.fillRegisterForm();

        }
        public void unsuccessfulTest() throws InterruptedException{
            openForm.open();
            fillRegisterForm.fillRegisterForm();
        }
    }
}
