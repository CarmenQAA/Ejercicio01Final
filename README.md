package com.bdd.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

import static net.serenitybdd.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //plugin = {"json:target/build/cucmber.json"},
        features = "src/test/resources/features",
        glue = "com.bdd.stepsdefinition",
        tags = "@WEB_SAUCEDEMO_COMPRA"
)
public class TestSuite {
    @Managed(uniqueSession = true, clearCookies = BeforeEachTest)
    WebDriver driver;

    @BeforeClass
    public static void beforeAll() {
        Logger.getLogger(TestSuite.class.getName()).info("Before all execution >>>");
    }


}


//Version v0.1

/*Estructura automatización. 
Test: 
Runner---> Rama de ejecución
stepsdefinition----> Rama para invocar los metodos 
tasks ---> rama de logica
userinterface----> rama para definir los localizadores
feature ----> rama para definir escenarios

Desde el terminal ejecutar los siguientes comandos 
** mvn clean 
** mvn install
*/
