package com.practice.pages;

import com.practice.common.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationPage extends BasePage {

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }
    public void register(String emailStr)  {
        String reg_mail_xpath = "//input[@id='email_create']";
        String registerButton = "//button[@id='SubmitCreate']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reg_mail_xpath)));
        WebElement email = driver.findElement(By.xpath(reg_mail_xpath));
        WebElement registrationButton = driver.findElement(By.xpath(registerButton));
        email.sendKeys(emailStr);
        registrationButton.click();


    }
    public void fillRegistrationForm(Map<String,String> registrationData) {
//        String titleXpath = "//input[@id = 'id_gender1']";
//        WebElement title = driver.findElement(By.xpath(titleXpath));
//        title.click();
        String firstnameXpath = "//input[@id='customer_firstname']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstnameXpath)));
        WebElement firstname = driver.findElement(By.xpath(firstnameXpath));
        firstname.sendKeys(registrationData.get("firstname"));
        String lastnameXpath = "//input[@id='customer_lastname']";
        WebElement lastname = driver.findElement(By.xpath(lastnameXpath));
        lastname.sendKeys(registrationData.get("lastname"));
        String passwordXpath = "//input[@id='passwd']";
        WebElement password = driver.findElement(By.xpath(passwordXpath));
        password.sendKeys(registrationData.get("password"));
        String dayValue = Util.splitDay(registrationData.get("dob"));
        String dayXpath = "//select[@id='days']";
        Select day = new Select(driver.findElement(By.xpath(dayXpath)));
        day.selectByValue(dayValue);
        String monthValue = Util.splitMonth(registrationData.get("dob"));
        String monthXpath = "//select[@id='months']";
        Select month = new Select(driver.findElement(By.xpath(monthXpath)));
        month.selectByValue(monthValue);
        String yearValue = Util.splitYear(registrationData.get("dob"));
        String yearXpath = "//select[@id='years']";
        Select year = new Select(driver.findElement(By.xpath(yearXpath)));
        year.selectByValue(yearValue);
        String fnameXpath = "//input[@id='firstname']";
        WebElement fname = driver.findElement(By.xpath(fnameXpath));
        fname.sendKeys(registrationData.get("fname"));
        String lnameXpath = "//input[@id='lastname']";
        WebElement lname = driver.findElement(By.xpath(lnameXpath));
        fname.sendKeys(registrationData.get("lname"));
        String companyXpath = "//input[@id='company']";
        WebElement company = driver.findElement(By.xpath(companyXpath));
        company.sendKeys(registrationData.get("company"));
        String addressXpath = "//input[@id='address1']";
        WebElement address = driver.findElement(By.xpath(addressXpath));
        address.sendKeys(registrationData.get("address"));
        String addressXpath2 = "//input[@id='address2']";
        WebElement address2 = driver.findElement(By.xpath(addressXpath2));
        address2.sendKeys(registrationData.get("address2"));
        String cityXpath = "//input[@id='city']";
        WebElement city = driver.findElement(By.xpath(cityXpath));
        city.sendKeys(registrationData.get("city"));
        String stateXpath = "//select[@id='id_state']";
        Select state = new Select(driver.findElement(By.xpath(stateXpath)));
        state.selectByValue(registrationData.get("state"));
        String zipCodeXpath = "//input[@id='postcode']";
        WebElement zipCode = driver.findElement(By.xpath(zipCodeXpath));
        zipCode.sendKeys(registrationData.get("zipCode"));
        String addlInfoXpath = "//textarea[@id='other']";
        WebElement addlInfo = driver.findElement(By.xpath(addlInfoXpath));
        addlInfo.sendKeys(registrationData.get("addlInfo"));
        String homephoneXpath = "//input[@id='phone']";
        WebElement homephone = driver.findElement(By.xpath(homephoneXpath));
        homephone.sendKeys(registrationData.get("homephone"));
        String mobilePhoneXpath = "//input[@id='phone_mobile']";
        WebElement mobilePhone = driver.findElement(By.xpath(mobilePhoneXpath));
        mobilePhone.sendKeys(registrationData.get("mobilePhone"));
        String referAddrXpath = "//input[@id='alias']";
        WebElement referAddr = driver.findElement(By.xpath(referAddrXpath));
        referAddr.sendKeys(registrationData.get("referAddr"));
        String registerXpath = "//button[@id='submitAccount']";
        driver.findElement(By.xpath(registerXpath)).click();
    }
    public void signIn(String emailStr, String passwordStr) {
        String loginEmailXpath = "//input[@id = 'email']";
        String passwordXpath = "//input[@id='passwd']";
        String button_xpath = "//button[@id='SubmitLogin']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginEmailXpath)));
        WebElement loginEmail = driver.findElement(By.xpath(loginEmailXpath));
        WebElement password = driver.findElement(By.xpath(passwordXpath));
        WebElement button = driver.findElement(By.xpath(button_xpath));
        loginEmail.sendKeys(emailStr);
        password.sendKeys(passwordStr);
        button.click();
    }

}
