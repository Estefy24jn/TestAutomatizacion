package org.example.TestAutomatizacion.Tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class SeleccionarCurso implements Task {

    private final String curso;

    public SeleccionarCurso(String curso) {
        this.curso = curso;
    }

    public static SeleccionarCurso llamado(String curso) {
        return new SeleccionarCurso(curso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Usa el identificador del curso (CSS o XPath) para hacer clic en el botón de "Agregar al carrito"
        actor.attemptsTo(
                Click.on(By.cssSelector(curso))  // Selecciona el curso basado en el selector CSS
        );
    }
}
