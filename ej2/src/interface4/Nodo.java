package interface4;

public class Nodo<T> implements Comparable<T>{
    
    private T dato;
    private Nodo<T> siguiente;
 
    /**
     * Constructor por defecto
     */
    public Nodo(){
        siguiente=null;
     }
 
    /**
     * Le pasamos un dato al nodo
     * @param p 
     */
    public Nodo(T p){
        siguiente=null;
        dato = p;
    }
 
    /**
     * Le pasamos un dato y su siguiente nodo al nodo
     * @param t Dato a insertar
     * @param siguiente Su sisguiente nodo
     */
    public Nodo(T t, Nodo<T> siguiente){
        this.siguiente=siguiente;
        dato = t;
    }
    public int compareTo(T t)
    {
    int resultado=0;
    if(this.dato>t){resultado=1;}
    else if(this.dato<t){resultado=-1;}
    else {resultado=0;}
    
    return resultado;
    }
     
    public T getDato() {
        return dato;
    }
 
    public void setDato(T dato) {
        this.dato = dato;
    }
 
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
     
}
