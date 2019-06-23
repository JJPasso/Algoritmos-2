package interface1;

class Par<A, B> implements Comparable<Par<A,B>>
{
	public A primero;   //  primer
	public B segundo;  	// segundo 

	
	public Par(A primero, B segundo)
	{
		this.primero = primero;
		this.segundo = segundo;
	}

	
	// Checks specified object is "equal to" current object or not
	public boolean equals(Par<String,Integer> o)
	{
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		Par<String, Integer> par = (Par<String, Integer>) o;

		if (!primero.equals(par.primero)) {
		} else {
			 return segundo.equals(par.segundo);
		}
	}

	@Override
	// Computes hash code for an object to support hash tables
	public int hashCode()
	{
		// use hash codes of the underlying objects
		return 31 * primero.hashCode() + segundo.hashCode();
	}

	@Override
	public String toString()
	{
		return "(" + primero + ", " + segundo + ")";
	}

	// Factory method for creating a Typed Par immutable instance
	public static <C, D> Par <C, D> of(C a, D b)
	{
		// calls private constructor
		return new Par<>(a, b);
	}

	@Override
	public int compareTo(Par<A, B> o) {
		if( this.equals(o) ) {
			return 0;
		}
		return -1;
	}
		// TODO Auto-generated method stub
        /* 
		if(this.primero < o.primero) {
			if(this.segundo < o.segundo)
				return -1;
		}
		if(this.primero == o.primero) {
			if(this.segundo == o.segundo) {
				return 0;
			} else {
				if(this.segundo < o.primero) {
					return -1;
				}
				return 1;
			}
			
		}
		if(this.primero > o.primero) {
			if(this.segundo > o.segundo) {
				return 1;
			} else {
				if(this.segundo == o.primero) {
					return 0;
				}
				return -1;
			}
		}
		
	}
	*/
}
