
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
    private Domicilio viveEn;

    public Socio(int añoDesde, Domicilio viveEn) {
        super();
        this.añoDesde = añoDesde;
        this.viveEn = viveEn;
    }
    
    public Socio()
    {
       // this();
    }

    public int getAñoDesde() {
        return añoDesde;
    }

    public void setAñoDesde(int añoDesde) {
        System.out.println("Introduzca el año desde que es socio: ");
        añoDesde = Leer.datoInt();
    }
    
    public void setCampoFecha ( GregorianCalendar obj)
    {
        fecha = obj;
    }

    public Domicilio getViveEn() {
        return viveEn;
    }

    public void setViveEn(Domicilio viveEn) {
        this.viveEn = viveEn;
    }
    
    public void getDato()
    {
        System.out.println("Pertenece desde: "+añoDesde);
    }

    
    
}
