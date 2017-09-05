package com.steps;

import com.pages.BBCPostPage;
import com.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {
    BBCPostPage postpage;
    RegistrationPage registrationpage;

    @Step
    public void navigatesToPost() {
        postpage.goToPost();
    }

    @Step
    public void wantsToComment() {
        postpage.comment();
    }

    @Step
    public void userIsAskedToLoginOrRegister() {
        postpage.verifyLoginBox();
    }

    @Step
    public void userOptsToRegister() {
        postpage.optsToRegister();
    }

    @Step
    public void isOnRegistrationPage() {
        registrationpage.verifyIsOnRegistrationPage();
    }

    @Step
    public void userOptsToLogin() {
        postpage.optsToLogin();
    }

    @Step
    public void isOnLoginPage() {
        registrationpage.isOnLoginPage();
    }

    @Step
    public void signsIn() {
        registrationpage.signsIn();
    }

    @Step
    public void entersUsername(String username) {
        registrationpage.enterUsername(username);
    }

    @Step
    public void entersPassword(String password) {
        registrationpage.enterPassword(password);
    }
}