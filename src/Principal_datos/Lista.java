package Principal_datos;

public class Lista<T>
{

    // Primer elemento de la lista
    private Nodo listaPersonas = null;
    
    // Cantidad de elementos que lleva la lista
    int nElementos=0;
    
  private class Nodo
  {
    private T datos;
    private Nodo siguiente;
        private Nodo(T d, Nodo s)
        {
                 datos = d;
                siguiente = s;
        }
  }
  
  public Lista(){}
  
  public int tamanio()
  {
    return nElementos;
  }
  
  public boolean anadir(int i, T obj)
  {
    if (i > nElementos || i < 0)
	{
	  System.err.println("Indice fuera de limites.");
	  return false;
	}
	
	Nodo q = new Nodo(obj, null);
	
	if (nElementos == 0)
	{
	  listaPersonas = q;
	  nElementos ++;
	  return true;
	}
	
	Nodo elemAnterior = listaPersonas;
	Nodo elemActual = listaPersonas;
	
	for (int n = 0; n < i; n++)
	{
	  elemAnterior = elemActual;
	  elemActual = elemActual.siguiente;
	}
	
	if (elemAnterior == elemActual) // Insertar por el principio
	{
	  q.siguiente = listaPersonas;
	  listaPersonas= q;
	}
	else // Insertar despu�s de elemAnterior
	{
	  q.siguiente = elemActual;
	  elemAnterior.siguiente = q;
	}
	nElementos++;
	return true;
  }
  
  public boolean anadirAlPrincipio(T obj)
  {
    return anadir(0, obj);
  }
  
  public boolean anadirAlFinal(T obj)
  {
    return anadir(tamanio(), obj);
  }
  
  public T borrar(int i)
  {
    if (i >= nElementos || i < 0)
	  return null;
	
	Nodo elemAnterior = listaPersonas;
	Nodo elemActual = listaPersonas;
	
	for (int n = 0; n < i; n++)
	{
	  elemAnterior = elemActual;
	  elemActual = elemActual.siguiente;
	}
	
	if (elemActual == listaPersonas) // Borrar el primero
	  listaPersonas = listaPersonas.siguiente;
	else // Borrar el siguiente a elemAnterior
	  elemAnterior.siguiente = elemActual.siguiente;
	  
	nElementos--;
	return elemActual.datos; // Se devuelve el elemento borrado
	
	// El elemento referenciado por elemActual ser� enviado al recolector por ser elemActual una variable local y no tener mas referencias ese objeto.
  }
  
  public T borrarPrimero()
  {
    return borrar(0);
  }
  
  public T borrarUltimo()
  {
    return borrar(nElementos-1);
  }
  
  public T obtener(int i)
  {
    if (i >= nElementos || i < 0)
	  return null;
	  
	Nodo q = listaPersonas;
	
	for (int n = 0; n < i; n++)
	  q = q.siguiente;
	
	return q.datos;
  }
  
  public T obtenerPrimero()
  {
    return obtener(0);
  }
  
  public T obtenerUltimo()
  {
    return obtener(nElementos-1);
  }
   
}