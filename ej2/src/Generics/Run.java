package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// https://www.geeksforgeeks.org/pair-class-in-java/
// https://www.techiedelight.com/five-alternatives-pair-class-java/
// https://alvinalexander.com/java/jwarehouse/deeplearning4j/deeplearning4j-core/src/main/java/org/deeplearning4j/berkeley/Pair.java.shtml
// https://www.techiedelight.com/implement-pair-class-java/

public class Run {
	

	public static void main(String[] args) {
		Par<String, Integer> p1 = new Par<String, Integer>("Z", 26);
		Par<String, Integer> p2 = new Par<String, Integer>("B", 30);
		Par<String, Integer> p3 = new Par<String, Integer>("C", 26);
		Par<String, Integer> p4 = new Par<String, Integer>("C", 2);
		Par<String, Integer> p5 = new Par<String, Integer>("C", 1);

		List<Par<String, Integer>> pares = new ArrayList<>();
		pares.add(p1);
		pares.add(p2);
		pares.add(p3);
		pares.add(p4);
		pares.add(p5);

		System.out.println("pares originales = "+pares);

		Collections.sort( pares, (p11, p21) -> {
			Par par1 = (Par) p11;
			Par par2 = (Par) p21;
			return par1.compareTo(par2);
		}	
		); 		
	     System.out.println("Ordenados"); 
	        for (int i=0; i<pares.size(); i++) {
	            System.out.println(pares.get(i).primero+ ","+pares.get(i).segundo); 
	        }

		
		//Set<Par<String, Integer>> paresDistintos = new HashSet<>(pares);
		//System.out.println("pares ordenados  = " + paresDistintos);
		
	}

}
