package org.example.TestAutomatizacion.Tareas;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class DirigirseAlCarrito implements Task {

    public static DirigirseAlCarrito carrito() {
        return new DirigirseAlCarrito();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Usar el selector CSS del carrito de compra
        actor.attemptsTo(
                Click.on(By.cssSelector(".cartcontents"))  // Selector CSS del carrito de compra
        );
    }
}
