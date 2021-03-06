package org.sm.dpc.behavioral.observer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        features = "classpath:cucumber/behavioral/observer.feature"
)
public class ObserverTest {
	
}
