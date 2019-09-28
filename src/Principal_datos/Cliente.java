package Principal_datos;


public class Cliente extends Persona{
    private int saldo;
    private String direccion;

    public Cliente(int saldo, String direccion, int codigo, float deuda, String nombre, int dia, int mes, int año) {
        super(codigo, deuda, nombre, dia, mes, año);
        this.saldo = saldo;
        this.direccion = direccion;
        
    }
    
    public Cliente ()
    {
        //this();
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
    
    public int getDato()
    {
        return saldo;
        
    }
    
    
    
}
