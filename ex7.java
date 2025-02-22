package exercice1;

public class ex7 {
	    public static void main(String[] args) {
	        int[][] tableau = {
	            {2, 5}, 
	            {1, 2, 3, 4}, 
	            {1, 1, 3}
	        };

	        trouverLigneMaxSomme(tableau);
	    }

	    public static void trouverLigneMaxSomme(int[][] tableau) {
	        int maxSomme = Integer.MIN_VALUE;
	        int indexMax = -1 ;
	        for (int i = 0; i < tableau.length; i++) {
	            int somme = 0;
	            for (int num : tableau[i]) {
	                somme += num;
	            }

	
	            if (somme > maxSomme) {
	                maxSomme = somme;
	                indexMax = i;
	            }
	        }

	        System.out.println("La ligne avec la plus grande somme est la ligne " + (indexMax + 1) + " avec une somme de " + maxSomme + ".");
	    }
	}


