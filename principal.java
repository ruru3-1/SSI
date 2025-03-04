import java.util.*;

public class principal{
    Scanner scanner = new Scanner(System.in);
    editar_maquina em = new editar_maquina();

    public void menu(){
        
            
        System.out.println("GesAMA: Gestión de Alquiler de Máquinas Agrícolas \nEditar Máquina (Pulsar M)\r\n" + //
                    "Editar Finca (Pulsar F)\r\n" + //
                    "Listar Máquinas (Pulsar L)\r\n" + //
                    "Estado Fincas (Pulsar E)\r\n" + //
                    "Alquiler Máquina (Pulsar A)\r\n" + //
                    "Plan Mensual Máquina (Pulsar P)\r\n" + //
                    "Salir (Pulsar S)\r\n" + //
                    "Teclear una opción válida (M|F|L|E|A|P|S)?");
    
        
        String option = scanner.nextLine();

        if(option.equals("M")){
            System.out.println("Editar Máquina:");
            em.menu();
        }
        else if(option.equals("F")){
            System.out.println("Editar Finca:");
        }
        else if(option.equals("L")){
            System.out.println("Listar Máquinas:");
        }
        else if(option.equals("E")){
            System.out.println("Estado Fincas:");
        }
        else if(option.equals("A")){
            System.out.println("Alquiler Máquina:");
        }
        else if(option.equals("P")){
            System.out.println("Plan Mensual Máquina:");
        }
        else if(option.equals("S")){
            System.out.println("Salir");
        }
        else{
            System.out.println("Opción no valida");
        }
    }
    
        
}