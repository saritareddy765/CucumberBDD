package com.CucumberBDD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    ScenarioContext scenarioContext;

    public LoginStepDefinitions(){
        scenarioContext = new ScenarioContext();
    }

    @Given("User on login page")
    public void user_on_login_page() {
        System.out.println("login page");
    }

    @When("User enter {string} and {string}")
    public void user_enter_credentials(String userName, String password) {
        System.out.println(" Enter :: " + userName + " and " + password);
        scenarioContext.setContext("UN",userName);
        scenarioContext.setContext("pwd",password);
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

    @When("User enter credentials")
    public void userEnterCredentials(DataTable dataTable){
        List<String> test = new ArrayList<>();
        List<List<String>> tests = new ArrayList<>();
        List<Map<String,String>> map = new ArrayList<>();
        List<String> firstRow = dataTable.row(0);
        System.out.println(firstRow.get(0));
        System.out.println(firstRow.get(1));
    }
}