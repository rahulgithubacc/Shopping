package com.practice.shopping;

import com.practice.pages.Authentication;
import com.practice.pages.HomePage;
import org.testng.annotations.Test;

public class Registration extends BaseTest {

    @Test
    public void logInClick() {
        HomePage homePage = new HomePage(this.driver);
        homePage.clickSignIn();
    }

    @Test
    public void registrationClick() {
        Authentication authentication = new Authentication(this.driver, this.wait);
        authentication.registration();
    }

}
