package Principal_datos;


import java.util.Calendar;
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
public class Socio extends Persona{
    private int añoDesde;
    private float comision;

    public Socio(int añoDesde, float comision, int codigo, float deuda, String nombre, int dia, int mes, int año) {
        super(codigo, deuda, nombre, dia, mes, año);
        this.añoDesde = añoDesde;
        this.comision = comision;
    }
    
    public Socio()
    {
       
    }

    public float getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    public void setAñoDesde(int año) {
        this.añoDesde = año;
    }
    
    public void setCampoFecha ( GregorianCalendar obj)
    {
        fecha = obj;
    }
    
    public int getDato()
    {
        return this.añoDesde;
    }

    
    
}
