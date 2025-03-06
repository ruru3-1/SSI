import java.util.*;

public class maquina {
    Scanner scanner = new Scanner(System.in);
    private int identificador;
    private String nombre;
    private String tipos;
    private int capacidad;
    private int latitud;
    private int longitud;

    private static ArrayList<maquina> lista_maquinas = new ArrayList<maquina>();

   public maquina(int identificador, String nombre, String tipos, int capacidad, int latitud, int longitud){
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipos = tipos;
        this.capacidad = capacidad;
        this.latitud = latitud;
        this.longitud = longitud;
    } 

    public int getIdentificador(){
        return identificador;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipos(){
        return tipos;
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

    public static int getMaquinas(){
        return lista_maquinas.size();
    }

    public static boolean identificador_en_uso(int ident){
        for(maquina m: lista_maquinas){
            if(m.getIdentificador() == ident){
                System.out.println("1");
                return true;
                
            }
        }
        System.out.println("3");
        return false;

    }

    public static void agregarMaquina(int identificador, String nombre, String tipos, int capacidad, int latitud, int longitud){
        lista_maquinas.add(new maquina(identificador, nombre, tipos, capacidad, latitud, longitud));
    }

    public static void listarMaquinas(String opciones){
        System.out.printf("%-10s %-13s %-13s %-10s%n", "Id", "Nombre", "Tipo", "Capacidad");
        System.out.println("-------------------------------------------------");
        for(maquina m : lista_maquinas){
            if(opciones.equals("T") || m.tipos.equals(opciones))
            System.out.printf("%-10s %-13s %-13s %-10s%n", m.getIdentificador(), m.getNombre(),m.getTipos(),m.getCapacidad() + " hectáreas/día");
        }
    }

    public static void eliminarMaquina(int id){
        Iterator<maquina> iterator = lista_maquinas.iterator();

        while(iterator.hasNext()){
            maquina m = iterator.next();
            if(m.getIdentificador() == id){
                iterator.remove();
                System.out.println("Se ha eliminado la finca");
                return;
            }
        }
        System.out.println("No existe finca para ese identificador");
    }

    public static String maquina_alquilada(int ident){
        Iterator<maquina> iterator = lista_maquinas.iterator();
        while(iterator.hasNext()){
            maquina m = iterator.next();
            if(m.getIdentificador() == ident){
                return m.getNombre();
            }else{
                return "No se encuentra ninguna máquina asociada a ese identificador";
            }
            
        }
        return "No se encuentra ninguna máquina asociada a ese identificador";
    }
}
