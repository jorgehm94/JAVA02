package Principal_datos;

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

    
}
