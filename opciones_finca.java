import java.util.*;

public class opciones_finca {
    private int contador =0;
    Scanner scanner = new Scanner(System.in);
    private int identificador;
    private String nombre;
    private String tipo;
    private int tamano;
    private int latitud;
    private int longitud;
    private int salida = 1;
    

    public void agregar_finca(){
        while(salida==1){
            System.out.println("Identificador(número entre 1 y 20)");
            identificador= scanner.nextInt();
            scanner.nextLine();
            if(identificador>0 && identificador<11){
                salida =0;                
            }else{
                System.out.println("Dato incorrecto, coríjalo");
            }   
        }
        salida =1;
        
        
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
            tipo = scanner.nextLine().toUpperCase();

            if(tipo.equals("G") || tipo.equals("U") || tipo.equals("A")){
                salida = 0;
            }else if(tipo.equals("B")){

            }else{
                System.out.println("El tipo no es correcto, corríjalo");
            }
        }
        salida = 1;

        while(salida == 1){
            System.out.println("Tamaño(Hectáreas)");
            if(scanner.hasNextInt()){
                tamano = scanner.nextInt();
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
                salida = 0;
                scanner.nextLine();
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
                salida = 0;
                scanner.nextLine();
            }else{
                System.out.println("Dato incorrecto, corríjalo");
                scanner.nextLine();
            }
        }
        salida = 1;

        System.out.println("IMPORTANTE: Esta opción borra los datos anteriores. \nSon correctos los nuevos datos(S/N)");
        String borrado = scanner.nextLine().toUpperCase();

        if(finca.getFincas()<10){
            if(borrado.equals("S") && tipo.equals("B")){
                finca.eliminarFinca(identificador);
            }else{
                finca.agregarFinca(identificador, nombre, tipo, tamano, latitud, longitud);
            }
        }else{
            System.out.println("No se pueden agregar mas máquinas");
        }
        if(finca.identificador_En_uso(identificador)){
            if(borrado.equals("S") && tipo.equals("B")){
                finca.eliminarFinca(identificador);
            }else if(borrado.equals("S")){
                System.out.println("La máquina no se guardará porque ya existe otra máquina con ese identificador");
            }
        }else if(finca.getFincas()<10){
            finca.agregarFinca(identificador, nombre, tipo, tamano, latitud, longitud);
        }else{
            System.out.println("No se pueden agregar mas máquinas");
        }

    }

    public void listar_fincas(){
        System.out.println("Estado de fincas a listar(G-Grano, U-Uva, A-Aceituna, T-Todas)");
        String opciones = scanner.nextLine().toUpperCase();
        finca.listarFincas(opciones);
    }



}
