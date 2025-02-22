package exercice1;

public class ex6 {
	    public static void main(String[] args) {
	        int[][] tableau = {
	            {1, 2, 3}, 
	            {4, 5}, 
	            {6, 7, 8, 9}
	        };

	        for (int i = 0; i < tableau.length; i++) {
	            int somme = 0;
	            for (int j = 0; j < tableau[i].length; j++) {
	                somme += tableau[i][j];
	            }
	            System.out.println("Somme de la ligne " + (i + 1) + " : " + somme);
	        }
	    }
	}


