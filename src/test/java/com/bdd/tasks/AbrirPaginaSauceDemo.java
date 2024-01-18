package com.bdd.tasks;

import freemarker.core.Environment;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaSauceDemo implements Task {
    private final String url;
    EnvironmentVariables environmentVariables;
    public AbrirPaginaSauceDemo(String url){this.url=url;}
    public static Task AbrirSauceDemoPage(){
        String url="saucedemo.page";
        return instrumented(AbrirPaginaSauceDemo.class,url);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(url)));
    }
}
