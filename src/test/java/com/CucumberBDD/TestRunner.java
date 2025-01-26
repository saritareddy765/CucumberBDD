package com.CucumberBDD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //copy path from Content root  of features directory
        features = "src/test/resources/features",
        // copy path from Source root of package
        glue = "com/CucumberBDD",
        plugin = "pretty"
       //dryRun = true,
       // monochrome = true

)
public class TestRunner {
}
