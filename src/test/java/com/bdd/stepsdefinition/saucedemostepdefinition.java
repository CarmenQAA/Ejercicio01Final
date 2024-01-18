package com.bdd.stepsdefinition;


import com.bdd.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class saucedemostepdefinition {
    //private WebDriver driver;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que Ingreso la pagina Saucedemo$")
    public void queIngresoLaPaginaSaucedemo() {
        theActorCalled("Cliente").attemptsTo(AbrirPaginaSauceDemo.AbrirSauceDemoPage());

    }
    @And("^Ingresamos los credenciales de acceso (.*), (.*)$")
    public void ingresamosLosCredencialesDeAccesoUsernamePassword(String username, String password) {
      theActorInTheSpotlight().attemptsTo(
              IngresarCredencialesSauceDemo.withData(username, password));
    }
    @When("^nos muestra la siguiente página agregamos dos productos al carrito$")
    public void nosMuestraLaSiguientePáginaAgregamosDosProductosAlCarrito() {
       theActorInTheSpotlight().attemptsTo(
               new AgregarProductoCart());
    }

    @And("^visualizamos el carrito con dos productos$")
    public void visualizamosElCarritoConDosProductos() {
        theActorInTheSpotlight().attemptsTo(new ValidarCart());
    }

    @And("^Registramos datos personales (.*),(.*) y (.*)$")
    public void registramosDatosPersonalesFirstNameLastNameYPostalCode(String firstname, String lastname,String postalcode) {
                theActorInTheSpotlight().attemptsTo(
                RegistrarDatosPersonales.withData(firstname,lastname,postalcode));
    }

    @When("^hacemos clic en botón Continuar$")
    public void hacemosClicEnBotónContinuar() {
           theActorInTheSpotlight().attemptsTo(
                   new ContinuarProceso());
    }

    @Then("^validamos la confirmación de la compra$")
    public void validamosLaConfirmaciónDeLaCompra() {
        String Texto = Serenity.sessionVariableCalled("texto");
        theActorInTheSpotlight().attemptsTo(
                new ValidarCompra());
    }
}
