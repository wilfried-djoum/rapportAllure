package org.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
    @FindBy(id = "style_avatar_wrapper__pEGIQ")
    private WebElement avatar;
    @FindBy(id = "email_login")
    private WebElement email_login;
    @FindBy(id = "password_login")
    private WebElement password_login;
    @FindBy(id = "btn_login")
    private WebElement connect_login;
    private String URL = "https://ztrain-web.vercel.app/home";

    public void navigateToHomePage() {
        this.get(URL);
    }

    public void fillEmailLogin(String email) {
        this.email_login.sendKeys(email);
    }

    public void fillPasswordLogin(String password) {
        this.password_login.sendKeys(password);
    }

    public void login(String email, String password) {
        this.fillEmailLogin(email);
        this.fillPasswordLogin(password);
        this.connect_login.click();
    }

//    public void connexion(){
//        this.avatar.click();
//        this.email_login.sendKeys("testeur@gmail.com");
//        this.password_login.sendKeys("12345678");
//        this.connect_login.click();
//    }
}
