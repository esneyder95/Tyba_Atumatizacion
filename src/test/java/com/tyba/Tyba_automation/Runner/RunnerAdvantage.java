package com.tyba.Tyba_automation.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty" }
        ,features="src/test/resources/features"
        ,glue="com.tyba.Tyba_automation"
        ,tags = "@Pruebas_tyba"
)

public class RunnerAdvantage {
}
