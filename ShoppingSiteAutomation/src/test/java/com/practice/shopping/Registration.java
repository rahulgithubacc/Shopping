package com.practice.shopping;

import com.practice.common.Util;
import com.practice.pages.AuthenticationPage;
import com.practice.pages.HomePage;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Registration extends BaseTest {

    @Test
    public void logInClick() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
    }

    @Test
    public void registrationClick()  {
        AuthenticationPage authentication = new AuthenticationPage(driver);
        String randomEmail = Util.generateRandomEmailAddress("rahul","deshmukh");
        authentication.register(randomEmail);
        Map<String,String> registrationData = new HashMap<>();
        registrationData.put("firstname","Rahul");
        registrationData.put("lastname","Deshmukh");
        registrationData.put("password","Rahul1996");
        registrationData.put("dob","8-11-1996");
        registrationData.put("fname","Rahul");
        registrationData.put("lname","Deshmukh");
        registrationData.put("company","Abc");
        registrationData.put("address","Kolkata");
        registrationData.put("address2","Salt Lake");
        registrationData.put("city", "Kolkata");
        registrationData.put("state","4");
        registrationData.put("zipCode","12345");
        registrationData.put("addlInfo","Kolkata,Kolkata");
        registrationData.put("homephone","0687955");
        registrationData.put("mobilePhone","085736484");
        registrationData.put("referAddr","Kolkata");
        authentication.fillRegistrationForm(registrationData);
    }


}
