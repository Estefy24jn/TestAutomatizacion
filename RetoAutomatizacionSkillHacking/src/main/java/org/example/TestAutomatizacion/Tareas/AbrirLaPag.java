package org.example.TestAutomatizacion.Tareas;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPag implements Task {

    private String url;

    public AbrirLaPag(String url) {
        this.url = url;
    }

    public static AbrirLaPag enLaUrl(String url) {
        return new AbrirLaPag(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url) // Utiliza la acción `Open` para abrir la URL
        );
    }
}
