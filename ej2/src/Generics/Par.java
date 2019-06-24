package Generics;

class Par<A extends Comparable<A>, B extends Comparable<B>> implements Comparable<Par<A,B>>
{
	public A primero;   //  primeror
	public B segundo;  	// segundo 

	
	public Par(A primero, B segundo)
	{
		this.primero = primero;
		this.segundo = segundo;
	}
    public A getPrimero() {
    	return this.primero;
    }
	
    public B getSegundo() {
    	return this.segundo;
    }
	// Checks specified object is "equal to" current object or not
	public boolean equals(Par<String,Integer> o)
	{
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		Par<String, Integer> par = (Par<String, Integer>) o;

		if (!primero.equals(par.primero))
			return false;
		return segundo.equals(par.segundo);
	}

	@Override
	// Computes hash code for an object to support hash tables
	public int hashCode()
	{
		// use hash codes of the underlying objects
		int hash = 31 * ((primero == null) ? 0 : primero.hashCode());
		return 31 * hash + ((segundo == null) ? 0 : segundo.hashCode());
	}

	@Override
	public String toString()
	{
		return "(" + primero + ", " + segundo + ")";
	}

	// Factory method for creating a Typed Par immutable instance
	/*public static <C, D> Par <C, D> of(C a, D b)
	{
		// calls private constructor
		return new Par<>(a, b);
	}*/

	@Override
	public int compareTo(Par<A, B> par) {
		int compare1 = this.getPrimero().compareTo(par.getPrimero());
		int compare2 = this.getSegundo().compareTo(par.getSegundo()); 
	    
		if( compare1  < 0 ) {
			System.out.println(this.getPrimero()+" < "+par.getPrimero()); 
    		return -1;
    	}
		if( compare1  > 0 ) {
			System.out.println(this.getPrimero()+" > "+par.getPrimero()); 
    		return 1;
    	}
	    if(( compare1  == 0 ) && ( compare2 == 0)) {
			System.out.println(this.getPrimero()+" == "+par.getPrimero()); 
    		return 0;
	    }
	    
		if ((compare1 == 0) && (compare2 > 0)) {
			System.out.println(this.getPrimero()+" == "+par.getPrimero()); 
			System.out.println(this.getSegundo()+" == "+par.getSegundo()); 
			return 1;
		};
		return compare2;
	}
}