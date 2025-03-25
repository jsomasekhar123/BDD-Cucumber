package com.sgtesting.DriverScript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
    features = "src/test/Resources/Featurefiles",
    glue="com/sgtesting/Stepdefinition",
     tags ="@Execute"
)

  
public class Driverscripts extends AbstractTestNGCucumberTests {

}
