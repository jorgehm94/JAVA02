package Principal_datos;

// Jorge Herrera, Sergio Ruiz

import Interfaz.ventanaPrincipal;
import javax.swing.JPanel;


public class main {

   private static ventanaPrincipal prog = new ventanaPrincipal();
    
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                prog.setVisible(true);
            }
        });

    }
    
    public static void cambiarPanel (JPanel j)
    {
        prog.setContentPane(j);
        prog.pack();
    }

    public static void cambiarTamaño(int ancho, int altura)
    {
        prog.setSize(ancho, altura);
    }
    
}
