import java.util.*;

public class opciones_maquinaria {
    Scanner scanner = new Scanner(System.in);
    private int contador = 0;
    private int salida = 1;
    private String tipos;
    private int identificador;
    private String nombre;
    private int capacidad;
    private int longitud;
    private int latitud;


    public void agregar_maquina(){
        while(salida==1){
            System.out.println("Identificador(número entre 1 y 10)");
            identificador = scanner.nextInt();
            scanner.nextLine();
            if(identificador>0 && identificador<11){
                salida = 0;
            }else{
                System.out.println("Dato incorrecto, coríjalo");
            }
            
            
        }
        salida = 1;
        
        while(salida == 1){
            contador = 0;
            System.out.println("Nombre(entre 1 y 20 caracteres)");
            nombre = scanner.nextLine();

            for(char c : nombre.toCharArray()){
                if(Character.isLetter(c)){
                    contador++;
                }
            }

            if(contador>0 && contador<=20){
                salida = 0;
            }else{
                System.out.println("Identificador incorrecto, corríjalo");
            }

        }
        salida = 1;

        while(salida == 1){
            System.out.println("Tipo(G-Grano, U-Uva, A-Aceituna, B-Borrar)");
            tipos = scanner.nextLine().toUpperCase();

            if(tipos.equals("G") || tipos.equals("U") || tipos.equals("A")){
                salida = 0;
            }else if(tipos.equals("B")){
                salida = 0;
            }else{
                System.out.println("El tipo no es correcto, corríjalo");
            }
        }
        salida = 1;

        while(salida == 1){
            System.out.println("Capacidad(hectáreas/días)");
            if(scanner.hasNextInt()){
                capacidad = scanner.nextInt();
                salida = 0;
                scanner.nextLine();
            }else{
                System.out.println("Dato incorrecto, corríjalo");
                scanner.nextLine();
            }
            
            
        }
        salida = 1;

        while(salida == 1){
            System.out.println("Ubicación inicial(Latitud)");
            if(scanner.hasNextInt()){
                latitud = scanner.nextInt();
                scanner.nextLine();
                salida = 0;                
            }else{
                System.out.println("Dato incorrecto, corríjalo");
                scanner.nextLine();
            }
        }
        salida = 1;
        
        while(salida == 1){
            System.out.println("Ubicación inicial(Longitud)");
            if(scanner.hasNextInt()){
                longitud = scanner.nextInt();
                scanner.nextLine();
                salida = 0;
            }else{
                System.out.println("Dato incorrecto, corríjalo");
                scanner.nextLine();
            }
        }
        salida = 1;

        
        

        System.out.println("IMPORTANTE: Esta opción borra los datos anteriores. \nSon correctos los nuevos datos(S/N)");
        String borrar = scanner.nextLine().toUpperCase();

        if(maquina.identificador_en_uso(identificador)){
            if(borrar.equals("S") && tipos.equals("B")){
                maquina.eliminarMaquina(identificador);
            }else if(borrar.equals("S")){
                System.out.println("La máquina no se guardará porque ya existe otra máquina con ese identificador");
            }
        }else if(maquina.getMaquinas()<10){
            maquina.agregarMaquina(identificador, nombre, tipos, capacidad, latitud, longitud);
        }else{
            System.out.println("No se pueden agregar mas máquinas");
        }

        
    }

    public void lista_maquinas(){
        System.out.println("Estado de maquinas a listar(G-Grano, U-Uva, A-Aceituna, T-Todas)");
        String opciones = scanner.nextLine().toUpperCase();
        maquina.listarMaquinas(opciones);

    }  

    
    
    
}
