import java.util.*;

public class editar_finca {
    private int identificador;
    private String nombre;
    private String tipo;
    private int tamano;
    private int latitud;
    private int longitud;
    private String borrado;
    private int contador=0;

    Scanner scanner = new Scanner(System.in);
    editar_finca[] fincas = new editar_finca[20];

    public editar_finca(int identificador, String nombre, String tipo, int tamano, int latitud, int longitud){
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public void menu(){
        System.out.println("Identificador(número entre 1 y 20)");
        identificador = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Nombre(entre 1 y 20 caracteres)");
        nombre = scanner.nextLine();

        System.out.println("Tipo(G-Grano, U-Uva, A-Aceituna, B-Borrar)");
        tipo = scanner.nextLine();

        System.out.println("Tamaño(Hectáreas)");
        tamano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ubicación inicial(Latitud)");
        latitud = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ubicación inicial(Longitud)");
        longitud = scanner.nextInt();
        scanner.nextLine();

        System.out.println("IMPORTANTE: Esta opción borra los datos anteriores. \nSon correctos los nuevos datos(S/N)");
        borrado = scanner.nextLine().toUpperCase();

        if(borrado.equals("S")){
            fincas[contador] = new editar_finca(identificador, nombre, tipo, tamano, latitud, longitud);
            contador++;
        }

    }

    public int getIdentificador(){
        return identificador;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public int getTamano(){
        return tamano;
    }

    public int getLatitud(){
        return latitud;
    }

    public int getLongitud(){
        return longitud;
    }

    public void mostrarMaquina(){
        for(int i = 0; i<contador;i++){
            System.out.println("Identificador "+ fincas[i].getIdentificador() + "\nNombre " + fincas[i].getNombre() + 
                            "\nTipo "+ fincas[i].getTipo() + "\nCapacidad "+  fincas[i].getTamano() + 
                            "\nUbicación inicial(Longitud) "+ fincas[i].getLongitud() +    
                            "\nUbicacion inicial(Longitud)"+ fincas[i].getLongitud());
        }
        
    }

}
