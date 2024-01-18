package com.bdd.tasks;

import com.bdd.userinterface.Saucedemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(Saucedemo.btn_cart,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Saucedemo.btn_cart),

                WaitUntil.the(Saucedemo.btn_checkout,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Saucedemo.btn_checkout));
    }
}
