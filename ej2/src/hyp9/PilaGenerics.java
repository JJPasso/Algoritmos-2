package hyp9;

import java.lang.reflect.Array;

public class PilaGenerics<E> implements Pila<E> {
	private E[] contenido;
	private int CIMA;
    private int MAX;
    public PilaGenerics(Class<E> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final E[] contenido = (E[]) Array.newInstance(c, s);
        this.contenido = contenido;
        this.CIMA = 0;
        this.MAX = s;
        
    }
    public boolean esPilallena()
    {
        if(this.CIMA == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean esPilavacia(){
        if(this.CIMA == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void poner(E x) {
        if(this.esPilallena())
        {
            System.out.println("overflow pila");
            System.exit(0);
        }
        else
        {
            this.CIMA++; 
            this.contenido[CIMA] = x;
                        
        }
    }
    public void sacar(E x) {
    	
        if(this.esPilavacia())
        {
            System.out.println("error cola vacia");
            System.exit(0);
        }
        else
        {   
        	x = contenido[CIMA]; 
            CIMA--;
        }
    }
    public void Vaciarpila(){
        CIMA = 0;
        
    } 
    public void MostrarPila()
    {
        if(this.esPilavacia())
        {
            System.out.println("cola sin datos");
        }
        else
        {
            String MOSTRAR = "";
             
            for(int i=CIMA;i>0;i--)
            {
                MOSTRAR = MOSTRAR + contenido[i]+"\n";
            }
             
            System.out.println("datos:" + MOSTRAR);
        }
    }
}
