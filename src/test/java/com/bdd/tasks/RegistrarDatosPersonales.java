package com.bdd.tasks;

import com.bdd.userinterface.Saucedemo;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarDatosPersonales implements Task {
    private final String firstname;
    private final String lastname;
    private final String postalcode;

    public RegistrarDatosPersonales(String firstname, String lastname, String postalcode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.postalcode = postalcode;
    }

    public static Performable withData(String firstname, String lastname, String postalcode) {
        return instrumented(RegistrarDatosPersonales.class, firstname, lastname,postalcode);
    }

    @Override
    @Step("{0} envia datos")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(Saucedemo.lbl_FirstName,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(firstname).into(Saucedemo.lbl_FirstName),

                WaitUntil.the(Saucedemo.lbl_lastName,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(lastname).into(Saucedemo.lbl_lastName),

                WaitUntil.the(Saucedemo.lbl_PostalCode,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(postalcode).into(Saucedemo.lbl_PostalCode));
    }
}



