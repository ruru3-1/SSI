import java.util.*;
import java.time.*;

public class alquiler {
    private int dia;
    private int mes;
    private int year;
    private int id_finca;
    private int id_maquina;

    Scanner scanner = new Scanner(System.in);

    public void alquiler_maquinas(){
        
        System.out.println("Fecha comienzo cosecha: día");
        dia = scanner.nextInt();

        System.out.println("Fecha comienzo cosecha: Mes");
        mes = scanner.nextInt();

        System.out.println("Fecha comienzo cosecha: Año");
        year = scanner.nextInt();

        System.out.println("Identificador de finca(número entre 1 y 20)");
        id_finca = scanner.nextInt();

        System.out.println("Identificador de máquina(número entre 1 y 10)");
        id_maquina = scanner.nextInt();

        System.out.println("\n      Resumen alquiler:\n");


        System.out.println("Máquina alquilada: "+ maquina.maquina_alquilada(id_maquina) );

        System.out.println("Finca a cosechar: ");
        System.out.println("Traslado desde: ");
        System.out.println("Distancia entre fincas: ");
        System.out.println("Tiempo de traslado: ");
        System.out.println("Fecha comienzo: ");
        System.out.println("DuraciÃ³n de la cosecha: ");
        System.out.println("Fecha finalización: ");
        System.out.println("Es ccorrecta la operación(S/N)");
    
    }
}
