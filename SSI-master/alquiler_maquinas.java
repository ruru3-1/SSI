import java.time.*;
import java.util.*;

public class alquiler_maquinas {
    private LocalDate fechaInicio;
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("Fecha comienzo cosecha: Día");


        System.out.println("Fecha comienzo cosecha: Mes");


        System.out.println("Fecha comienzo cosecha: Año");


        System.out.println("Identificador de finca(número entre 1 y 20)");


        System.out.println("Identificador de máquina(número entre 1 y 10)");


        System.out.println("\n      Resumen alquiler:\n");


        System.out.println("Máquina alquilada: ");

        System.out.println("Finca a cosechar: ");
        System.out.println("Traslado desde: ");
        System.out.println("Distancia entre fincas: ");
        System.out.println("Tiempo de traslado: ");
        System.out.println("Fecha comienzo: ");
        System.out.println("Duración de la cosecha: ");
        System.out.println("Fecha finalización: ");
        System.out.println("Es ccorrecta la operación(S/N)");
    }
}
