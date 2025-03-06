import java.util.*;

public class finca {
    private int identificador;
    private String nombre;
    private String tipo;
    private int tamano;
    private int latitud;
    private int longitud;

    private static ArrayList<finca> lista_finca = new ArrayList<finca>();

    Scanner scanner = new Scanner(System.in);

    public finca(int identificador, String nombre, String tipo, int tamano, int latitud, int longitud){
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.latitud = latitud;
        this.longitud = longitud;
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

    public static int getFincas(){
        return lista_finca.size();
    }

    public static boolean identificador_En_uso(int ident){
        for(finca f: lista_finca){
            if(f.getIdentificador() == ident){
                return false;
            }
        }
        return true;
    }

    public static void agregarFinca(int identificador, String nombre, String tipo, int tamano, int latitud, int longitud){
        lista_finca.add(new finca(identificador, nombre, tipo, tamano, latitud, longitud));
    }

    public static void listarFincas(String opciones){
        System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s%n", "Id", "Nombre", "Tipo", "Tamaño", "Latitud", "Longitud");
        System.out.println("----------------------------------------------------------------------");
        for(finca f: lista_finca){
            if(opciones.equals("T") || f.tipo.equals(opciones)){
                System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s%n",f.getIdentificador(),f.getNombre(),f.getTipo(),f.getTamano() + " hectáreas",f.getLatitud(),f.getLatitud());
            }
           
        }     
    }

    public static void eliminarFinca(int id){
        Iterator<finca> iterator = lista_finca.iterator();

        while(iterator.hasNext()){
            finca f = iterator.next();
            if(f.getIdentificador() == id){
                iterator.remove();
                System.out.println("Se ha eliminado la finca");
                return;
            }
        }
        System.out.println("No existe finca para ese identificador");
    }

    public static String finca_alquilada(int ident){
        Iterator<finca> iterator = lista_finca.iterator();
        while(iterator.hasNext()){
            finca m = iterator.next();
            if(m.getIdentificador() == ident){
                return m.getNombre();
            }else{
                return "No se encuentra ninguna máquina asociada a ese identificador";
            }
            
        }
        return "No se encuentra ninguna máquina asociada a ese identificador";
    }
}
