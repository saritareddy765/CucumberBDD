package com.CucumberBDD;

import io.cucumber.java.en.*;

public class LoginStepDefinitions {
    @Given("User on login page")
    public void user_on_login_page() {
        System.out.println("login page");
    }

    @When("User enter {string} and {string}")
    public void user_enter_credentials(String userName, String password) {
        System.out.println(" Enter :: " + userName + " and " + password);
    }
    @And("User click on submit")
    public void user_click_on_submit(){
        System.out.println("Submit");
    }
    @Then("User verify products page")
    public void user_verify_products_page(){
        System.out.println("Products Page");
    }
    @And("User verify single product")
    public void user_verify_single_product(){
        System.out.println("Single Product");
    }
}