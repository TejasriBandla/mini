package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="E:\\parallel project\\Myntra2\\featues\\end to end.feature",glue= {"E:\\parallel project\\Myntra2\\src\\test\\java\\stepdef\\endsteps.java"})
public class Run extends AbstractTestNGCucumberTests {

}
