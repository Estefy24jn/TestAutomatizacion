package stepDefinitions;

import io.cucumber.java.es.Dado; // Para steps en español
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.TestAutomatizacion.Tareas.*;
import org.junit.Assert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AñadirCompraStep {

    @Dado("que el usuario realiza el ingreso al sistema")
    public void que_el_usuario_realiza_el_ingreso_al_sistema() {

        OnStage.theActorCalled("Usuario").wasAbleTo(
                AbrirLaPag.enLaUrl("http://practice.automationtesting.in/shop/")
        );
    }

    @Cuando("se seleccionan los cursos {string} y {string} ")
    public void se_seleccionan_los_cursos(String curso1, String curso2) {

        //Para seleccionar el primer curso
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCurso.llamado(curso1)  // Paso del curso1
        );
        // Para Seleccionar el segundo curso
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCurso.llamado(curso2)  // Paso del curso2
        );
    }

    @Cuando("se dirige a la seccion de carrito de compra")
    public void se_dirige_a_la_seccion_de_carrito_de_compra() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                DirigirseAlCarrito.carrito()
        );

    }

    @Cuando("se elimina el curso {string}")
    public void se_elimina_el_curso ( String cursoEliminado) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                EliminarCurso.llamado(cursoEliminado)
        );

    }
















    
}