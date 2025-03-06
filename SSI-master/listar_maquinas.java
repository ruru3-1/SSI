public class listar_maquinas {

    public void lista(editar_maquina registro){
        editar_maquina em = new editar_maquina(0, null, null, 0, 0, 0);

        System.out.println("Tipo de máquinas a listar(G-Grano, U-Uva, A-Aceituna, T-Todas)");
       
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Id", "Nombre", "Tipo", "Capacidad");
        System.out.println("----------------------------------");

        for (int i=0; i<em.getMaquinas().size() ; i++) {
            System.out.printf("%-10d %-10s %-10s %-10d%n", em.getMaquinas().identificador, maquinas[i].getNombre(), maquinas[i].getTipo(), maquinas[i].getCapacidad());
        }
        System.out.println("\n");
    }

    
}
