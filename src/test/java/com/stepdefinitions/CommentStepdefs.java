package com.stepdefinitions;

import com.steps.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Steps;

public class CommentStepdefs implements En{
    @Steps
    EndUserSteps user;

    public CommentStepdefs() {
        Given("^user is on BBC post page$", () -> {
            user.navigatesToPost();
        });

        When("^user wants to comment$", () -> {
            user.wantsToComment();
        });

        Then("^user should is asked to signin or register$", () -> {
            user.userIsAskedToLoginOrRegister();
        });

        When("^user wants to register$", () -> {
            user.userOptsToRegister();
        });
        When("^user wants to login$", () -> {
            user.userOptsToLogin();
        });
    }
}
