import java.util.*;

public class editar_maquina {
    Scanner scanner = new Scanner(System.in);
    private int ident;
    private String name;
    private String type;
    private int capacity;
    private int latitude;
    private int longitude;
    private String delete;

    public void menu(){
        System.out.println("Identificador(número entre 1 y 10)");
        ident = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Nombre(entre 1 y 20 caracteres)");
        name = scanner.nextLine();

        System.out.println("Tipo(G-Grano, U-Uva, A-Aceituna, B-Borrar)");
        type = scanner.nextLine();

        System.out.println("Capacidad(hectáreas/días)");
        capacity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ubicación inicial(Latitud)");
        latitude = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ubicación inicial(Longitud)");
        longitude = scanner.nextInt();
        scanner.nextLine();

        System.out.println("IMPORTANTE: Esta opción borra los datos anteriores. \nSon correctos los nuevos datos(S/N)");
        delete = scanner.nextLine();

    }
}
