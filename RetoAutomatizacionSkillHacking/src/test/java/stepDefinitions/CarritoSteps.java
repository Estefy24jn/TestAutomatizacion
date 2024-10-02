package stepDefinitions;



import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;

import net.serenitybdd.screenplay.questions.Value;
import org.example.TestAutomatizacion.Tareas.CapturarValorTotal;

public class CarritoSteps {

    private int valorTotal;

    @Cuando("se captura el valor total del carrito")
    public void se_captura_el_valor_total_del_carrito() {
        // El actor captura el valor total del carrito
        OnStage.theActorInTheSpotlight().attemptsTo(
                CapturarValorTotal.desdeElCarrito()
        );

        // Aquí se puede almacenar el valor total en una variable para uso posterior
        valorTotal = OnStage.theActorInTheSpotlight().asksFor(new CapturarValorTotal().getPrecioTotal());
    }

    @Cuando("se verifica que el valor del precio total sea menor a {string}")
    public void valor_a_pagar_menor_(String num) {
        int valorComparacion = Integer.parseInt(num);

        // Verificar que el valor total capturado es menor que el valor proporcionado
        if (valorTotal < valorComparacion) {
            System.out.println("El valor total (" + valorTotal + ") es menor que " + valorComparacion);
        } else {
            System.out.println("El valor total (" + valorTotal + ") no es menor que " + valorComparacion);
        }
    }
}
