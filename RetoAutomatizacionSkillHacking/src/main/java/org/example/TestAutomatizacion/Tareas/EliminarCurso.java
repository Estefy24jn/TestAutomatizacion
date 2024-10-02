package org.example.TestAutomatizacion.Tareas;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class EliminarCurso implements Task {

    private final String cursoEliminado;

    public EliminarCurso(String cursoEliminado) {
        this.cursoEliminado = cursoEliminado;
    }

    public static EliminarCurso llamado(String cursoEliminado) {
        return new EliminarCurso(cursoEliminado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Por ejemplo, si hay un botón de eliminar asociado al curso eliminado:
        actor.attemptsTo(
                Click.on(By.xpath("//div[contains(text(),'" + cursoEliminado + "')]/following-sibling::div//a[contains(@class,'remove')]"))
        );
    }
}
