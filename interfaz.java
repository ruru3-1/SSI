import java.util.*;

public class interfaz{
    Scanner scanner = new Scanner(System.in);
    opciones_maquinaria em = new opciones_maquinaria();
    opciones_finca f = new opciones_finca();
    alquiler al = new alquiler();
    private int continuar = 1;

    public void menu(){   
        while(continuar == 1){      
            System.out.println("GesAMA: Gestión de Alquiler de Máquinas Agrícolas \nEditar Máquina (Pulsar M)\r\n" + //
                        "Editar Finca (Pulsar F)\r\n" + //
                        "Listar Máquinas (Pulsar L)\r\n" + //
                        "Estado Fincas (Pulsar E)\r\n" + //
                        "Alquiler Máquina (Pulsar A)\r\n" + //
                        "Plan Mensual Máquina (Pulsar P)\r\n" + //
                        "Salir (Pulsar S)\r\n" + //
                        "Teclear una opción válida (M|F|L|E|A|P|S)?");
        
            
            String option = scanner.nextLine().toUpperCase();

            if(option.equals("M")){
                System.out.println("Editar Máquina:");
                em.agregar_maquina();
            }
            else if(option.equals("F")){
                System.out.println("Editar Finca:");
                f.agregar_finca();
            }
            else if(option.equals("L")){
                System.out.println("Listar Máquinas:");
                em.lista_maquinas();
            }
            else if(option.equals("E")){
                System.out.println("Estado Fincas:");
                f.listar_fincas();
            }
            else if(option.equals("A")){
                System.out.println("Alquiler Máquina:");
                al.alquiler_maquinas();
            }
            else if(option.equals("P")){
                System.out.println("Plan Mensual Máquina:");
            }
            else if(option.equals("S")){
                System.out.println("Salir");
                continuar=0;
            }
            else{
                System.out.println("Opción no valida");
            }

        }

        
        
    }
    
        
}