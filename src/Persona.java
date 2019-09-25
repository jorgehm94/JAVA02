
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public abstract class Persona {
    private String nombre;
    private int codigo;
    private float deuda; //No es seguro, como ejemplo 
    GregorianCalendar fecha;
    
    Persona(int codigo, float deuda, String nombre, int dia, int mes, int año )
    {
        this();
        this.codigo = codigo;
        this.deuda = deuda;
        this.nombre = nombre;
        GregorianCalendar fecha = new GregorianCalendar();
    }
    
    Persona()
    {

        
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        System.out.println("Introduzca la deuda que tiene (0 si no tiene): ");
        deuda = Leer.datoFloat();
    }
    
    public abstract void getDato();
    
    //public abstract void perteneceDesde();
    
    
}
