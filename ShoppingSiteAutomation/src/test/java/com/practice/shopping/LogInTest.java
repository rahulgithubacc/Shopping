package com.practice.shopping;

import com.practice.pages.Authentication;
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
        Authentication logInPage = new Authentication(this.driver, this.wait);
        logInPage.signIn();
    }

}
