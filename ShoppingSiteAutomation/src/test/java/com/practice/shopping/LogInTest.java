package com.practice.shopping;

import com.practice.pages.AuthenticationPage;
import com.practice.pages.HomePage;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    @Test
    public void logInClick() {
        HomePage homePage = new HomePage(this.driver);
        homePage.clickSignIn();
    }

    @Test
    public void login() {
        AuthenticationPage logInPage = new AuthenticationPage(driver);
        logInPage.signIn("rahul_deshmukh_1@yopmail.com", "Rahul1996");
    }

}
