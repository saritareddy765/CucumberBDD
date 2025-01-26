package com.CucumberBDD;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
    @BeforeAll
    public static void initialize(){
        System.out.println("initialize");
    }
    @Before
    public static void beforeEveyScenario(Scenario scenario){
        // System.out.println(scenario.getName());
        System.out.println("For Every Scenario/Test");
    }
    @BeforeStep
    public static void beforeEveryStep(Scenario scenario){
       // System.out.println(scenario.getLine());
        System.out.println("For EveryStep");
    }
}
