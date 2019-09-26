package Principal_datos;

import Interfaz.ventanaPrincipal;


public class main {

    
    static Lista<Persona> listaPrincipal = new Lista() ;
    
    
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });

    }
    

}
