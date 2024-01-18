package com.bdd.tasks;


import com.bdd.userinterface.Saucedemo;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarCredencialesSauceDemo implements Task {
    private final String username;
    private final String password;

    public IngresarCredencialesSauceDemo(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public static Performable withData(String username, String password) {
        return instrumented(IngresarCredencialesSauceDemo.class, username, password);
    }

    @Override
    @Step("{0} envia datos")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(Saucedemo.txt_username,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(username).into(Saucedemo.txt_username),
                WaitUntil.the(Saucedemo.txt_password,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(password).into(Saucedemo.txt_password),
                WaitUntil.the(Saucedemo.btn_Login,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Saucedemo.btn_Login));
    }
}

