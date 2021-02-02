package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources",glue="com.stepdefinition")
@CucumberOptions(features=".\\src\\test\\resources\\Features\\JIRAAPI_1.feature",
glue="com.stepdefinition",dryRun=false)
public class TestRunner {
	
}
