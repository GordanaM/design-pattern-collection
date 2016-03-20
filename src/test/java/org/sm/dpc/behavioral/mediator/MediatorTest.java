package org.sm.dpc.behavioral.mediator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "org.sm.dpc.behavioral.mediator.steps",
        features = "classpath:cucumber/mediator.feature"
)
public class MediatorTest {
	
}
