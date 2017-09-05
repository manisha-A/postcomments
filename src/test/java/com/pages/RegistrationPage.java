package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class RegistrationPage extends PageObject {

    @FindBy(id = "dateOfBirthField")
    private WebElementFacade dobField;

    @FindBy(id = "submit-button")
    private WebElementFacade signIn;

    @FindBy(id = "username-input")
    private WebElementFacade unameInput;

    @FindBy(id = "password-input")
    private WebElementFacade upassInput;

    public void verifyIsOnRegistrationPage() {
        assert  dobField.isDisplayed();
        verifyUrl("register");
    }

    public void isOnLoginPage() {
        assert  getDriver().findElement(By.className("heading")).getText().contains("Sign in");
        verifyUrl("signin");
    }

    private void verifyUrl(String url){
        assert  getDriver().getCurrentUrl().contains(url);
    }

    public void signsIn() {
        signIn.click();
    }

    public void enterUsername(String username) {
        unameInput.type(username);
    }

    public void enterPassword(String password) {
        upassInput.type(password);
    }
}
