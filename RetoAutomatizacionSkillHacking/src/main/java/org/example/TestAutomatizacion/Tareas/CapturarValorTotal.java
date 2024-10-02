package org.example.TestAutomatizacion.Tareas;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

public class CapturarValorTotal implements Task {

    private int precioTotal;

    public int getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Usar el selector CSS para obtener el precio total del carrito
        String selectorPrecioTotal = "strong > .woocommerce-Price-amount"; // Ajustar según la estructura real

        // Capturar el valor total del carrito
        String precioTotalTexto = Text.of(By.cssSelector(selectorPrecioTotal)).answeredBy(actor);
        precioTotal = (int) Double.parseDouble(precioTotalTexto.replaceAll("[^0-9.]", "")); // Eliminar caracteres no numéricos y convertir a int

        // Opcional: puedes imprimir el precio total
        System.out.println("El precio total del carrito es: " + precioTotal);
    }

    public static CapturarValorTotal desdeElCarrito() {
        return new CapturarValorTotal();
    }
}
