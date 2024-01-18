package com.bdd.tasks;

import com.bdd.userinterface.Saucedemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductoCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(Saucedemo.btn_Produc01,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Saucedemo.btn_Produc01),
                WaitUntil.the(Saucedemo.btn_Produc02,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Saucedemo.btn_Produc02));
    }

}
