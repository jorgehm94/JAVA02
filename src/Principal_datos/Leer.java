package Principal_datos;

import java.io.*;

public class Leer
{
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  
  public static short datoShort()
  {
    boolean correcto;
    short aux=0;
    
      do {          
          try {
              aux = Short.parseShort(dato());
              return aux;
          } catch (NumberFormatException e) {
               System.out.print("Has metido letras, intentelo de nuevo: ");
              correcto=false; // valor más pequeño
          }
      } while (!correcto);
      
      return aux;
  }
  
  public static int datoInt()
  {
     boolean correcto;
       int aux=0;
    
      do {          
          try {
              aux = Integer.parseInt(dato());
              return aux;
          } catch (NumberFormatException e) {
               System.out.print("Has metido letras, intentelo de nuevo: ");
              correcto=false; // valor más pequeño
          }
      } while (!correcto);
      
      return aux;
  }
  
  public static long datoLong()
  {
    boolean correcto;
    long aux=0;
    
      do {          
          try {
              aux = Long.parseLong(dato());
              return aux;
          } catch (NumberFormatException e) {
               System.out.print("Has metido letras, intentelo de nuevo: ");
              correcto=false; // valor más pequeño
          }
      } while (!correcto);
      
      return aux;
  }
  
  public static float datoFloat()
  {
    boolean correcto;
    float aux=0;
    
      do {          
          try {
              aux = Float.parseFloat(dato());
              return aux;
          } catch (NumberFormatException e) {
              System.out.print("Has metido letras, intentelo de nuevo: ");
              correcto=false; // valor más pequeño
          }
      } while (!correcto);
      
      return aux;
  }

  
  public static double datoDouble()
  {
    boolean correcto;
    double aux=0;
    
      do {          
          try {
              aux = Double.parseDouble(dato());
              return aux;
          } catch (NumberFormatException e) {
               System.out.print("Has metido letras, intentelo de nuevo: ");
              correcto=false; // valor más pequeño
          }
      } while (!correcto);
      
      return aux;
  }
}