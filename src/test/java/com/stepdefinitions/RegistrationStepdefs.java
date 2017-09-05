package com.stepdefinitions;

import com.steps.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Steps;

public class RegistrationStepdefs implements En {
    @Steps
    EndUserSteps user;

    public RegistrationStepdefs() {
        Then("^user is navigated to registration page$", () -> {
            user.isOnRegistrationPage();
        });
        Then("^user is navigated to login page$", () -> {
            user.isOnLoginPage();
        });
        When("^user enters username as \"([^\"]*)\"$", (String username) -> {
            user.entersUsername(username);
        });

        And("^user enters password as \"([^\"]*)\"$", (String password) -> {
            user.entersPassword(password);
        });

        And("^user signs in$", () -> {
           user.signsIn();
        });
    }
}
