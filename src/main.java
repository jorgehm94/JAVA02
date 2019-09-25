
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        Cliente listaClientes[];
        Socio listaSocios[];
        
        System.out.println("Introduce el numero de clientes: ");
        int nclientes=Leer.datoInt();
        
        
        do {            
            mostrarMenu();
            opcion = elegirOpcion();
            tratarMenu();
        } while (opcion!=5);
    }
    
    public static void mostrarMenu()
    {
        System.out.println("MENU");
        System.out.println("1. Alta");
    }
    
}
