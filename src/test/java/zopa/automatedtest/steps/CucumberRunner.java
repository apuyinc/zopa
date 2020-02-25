package zopa.automatedtest.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/zopa/automatedtest/"}/*,
        steps = {"src/test/java/zopa/automatedtest/steps/"}/*
        plugin = {"json:target/cucumber.json", "pretty:target/cucumber-pretty.html", "html:target/cucumber-html.html"}*/)

public class CucumberRunner {
}


