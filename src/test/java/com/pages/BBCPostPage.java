package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class BBCPostPage extends PageObject {

    private final String SIGNIN_MSG = "Sign in to the BBC, or Register to comment and rate comments";
    private final String POST_URL = "http://www.bbc.co.uk/blogs/test/entries/e1da81f0-4d27-4203-8fa0-2a7aaaca6fc1";

    @FindBy(className = "blogs-comments-link")
    private WebElementFacade postComments;

    @FindBy(id = "comments")
    private WebElementFacade commentsBox;

    @FindBy(id = "id4-cta-1")
    private WebElementFacade commentsBox1;

    public void goToPost() {
        getDriver().get(POST_URL);
    }

    public void comment() {
        postComments.click();
    }

    public void verifyLoginBox() {
        assert commentsBox.isDisplayed();
    }

    public void optsToRegister() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", getDriver().findElement(By.className("id4-cta-register")));
    }

    public void optsToLogin() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", getDriver().findElement(By.className("id4-cta-signin")));
    }
}
