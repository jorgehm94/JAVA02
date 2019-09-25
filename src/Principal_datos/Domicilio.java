package Principal_datos;


public class Domicilio {
    private String domicilio;
    private String ciudad;

    public Domicilio(String domicilio, String ciudad) {
        this.domicilio = domicilio;
        this.ciudad = ciudad;
    }

    public void getDomicilio() {
        System.out.println("Su domicilio es: "+this.domicilio);
    }

    public void getCiudad() {
        System.out.println("Su ciudad es: "+this.ciudad);
    }
    
    
    
    
}
