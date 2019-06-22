package hyp9;

import java.lang.reflect.Array;

public class ColaGenerics<E> implements Cola<E> {
	private E[] contenido;
	private int FRENTE;
    private int FINAL;
    private int MAX;
    public ColaGenerics(Class<E> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final E[] contenido = (E[]) Array.newInstance(c, s+1);
        this.contenido = contenido;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.MAX = s;
        
    }
    public boolean esColallena()
    {
        if(this.FINAL == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean esColavacia(){
        if(this.FRENTE == this.FINAL)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void encolar(E x) {
        if(this.esColallena())
        {
            System.out.println("overflow cola");
            System.exit(0);
        }
        else
        {
            this.FINAL++; 
            this.contenido[FINAL] = x;
                        
        }
    }
    public void desencolar(E x) {
    	
        if(this.FRENTE == this.FINAL)
        {
            System.out.println("error cola vacia");
            System.exit(0);
        }
        else
        {   
        	x = contenido[FRENTE];
            for(int i=FRENTE;i < FINAL - 1;i++)
            {
                contenido[i] = contenido[i+1];
            }
             
            FINAL--;
        }
    }
    public void Vaciarcola(){
        FRENTE = 0;
        FINAL = 0;
    } 
    public void MostrarCola()
    {
        if(this.esColavacia())
        {
            System.out.println("cola sin datos");
        }
        else
        {
            String MOSTRAR = "";
             
            for(int i=FRENTE+1;i<=FINAL;i++)
            {
                MOSTRAR = MOSTRAR + contenido[i]+"\n";
            }
             
            System.out.println("datos:" + MOSTRAR);
        }
    }
}
    

