
public class Cliente extends Persona{
    private int saldo;
    private Domicilio viveEn;

    public Cliente(int saldo, Domicilio viveEn) {
        super();
        this.saldo = saldo;
        this.viveEn = viveEn;
        
    }
    
    public Cliente ()
    {
        //this();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        System.out.println("Introduzca el saldo del Cliente: ");
        saldo = Leer.datoInt();
    }

    public Domicilio getViveEn() {
        return viveEn;
    }

    public void setViveEn(Domicilio viveEn) {
        this.viveEn = viveEn;
    }
   
    
    public void getDato()
    {
        System.out.println("Su dinero es: "+saldo);
        
    }
    
    
    
}
