import java.util.*;

public class editar_maquina {
    Scanner scanner = new Scanner(System.in);
    private int identificador;
    private String nombre;
    private String tipo;
    private int capacidad;
    private int latitud;
    private int longitud;
    private String borrado;
    private int contador=0;

   // private editar_maquina[] maquinas ;

    ArrayList<editar_maquina> maquinas = new ArrayList<editar_maquina>();

    public editar_maquina(int identificador, String nombre, String tipo, int capacidad, int latitud, int longitud){
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public void menu(){
        System.out.println("Identificador(número entre 1 y 10)");
        identificador = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Nombre(entre 1 y 20 caracteres)");
        nombre = scanner.nextLine();

        System.out.println("Tipo(G-Grano, U-Uva, A-Aceituna, B-Borrar)");
        tipo = scanner.nextLine();

        System.out.println("Capacidad(hectáreas/días)");
        capacidad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ubicación inicial(Latitud)");
        latitud = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ubicación inicial(Longitud)");
        longitud = scanner.nextInt();
        scanner.nextLine();

        System.out.println("IMPORTANTE: Esta opción borra los datos anteriores. \nSon correctos los nuevos datos(S/N)");
        borrado = scanner.nextLine().toUpperCase();

        if(borrado.equals("S") && contador<10){
            maquinas.add(new editar_maquina(identificador, nombre, tipo, capacidad, latitud, longitud));
            contador++;
        }else if(tipo.equals("B")){
            contador--;
        }else{
            System.out.println("No se pueden agragar mas maquinaria");
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

    public int getCapacidad(){
        return capacidad;
    }

    public int getLatitud(){
        return latitud;
    }

    public int getLongitud(){
        return longitud;
    }

    public int getTamanoArray(){
        return maquinas.size();
    }

    public ArrayList<editar_maquina> getMaquinas(){
        return maquinas;
    }

    public void listar_maquinas(){
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Id", "Nombre", "Tipo", "Capacidad");
        System.out.println("----------------------------------");
        for(editar_maquina m : maquinas){
            System.out.printf("%-10s %-10s %-10s %-10s%n", m.getIdentificador(), m.getNombre(),m.getTipo(),m.getCapacidad());
        }
        
    }
}
