package org.decibel.test.stepDefinition;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import org.decibel.test.actions.GeneralActions;

public class GeneralSteps {

    @Steps
    private GeneralActions generalActions;

    @Given("^A user access to google$")
    public void accessToGoogle(){
        generalActions.openBrowser();
    }




}
