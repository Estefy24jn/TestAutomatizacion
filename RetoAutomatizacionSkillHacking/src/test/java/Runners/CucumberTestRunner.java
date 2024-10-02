package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features", // Ruta de tus archivos .feature
        glue = "src/test/java/stepDefinitions",  // Paquete donde están los step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class CucumberTestRunner {



}

