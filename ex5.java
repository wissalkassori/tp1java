package exercice1;
import java.util.HashSet;
public class ex5 {
	

	
	    public static void main(String[] args) {
	        int[][] matrice = {
	            {1, 2, 3},
	            {6, 5, 4},
	            {7, 8, 9}
	        };

	        if (estPermutation(matrice)) {
	            System.out.println("La matrice est une permutation des nombres de 1 à " + (matrice.length * matrice.length));
	        } else {
	            System.out.println("La matrice n'est PAS une permutation valide.");
	        }
	    }

	    public static boolean estPermutation(int[][] matrice) {
	        int n = matrice.length;
	        int taille = n * n;
	        HashSet<Integer> valeurs = new HashSet<>();

	        for (int[] ligne : matrice) {
	            for (int val : ligne) {
	                if (val < 1 || val > taille || valeurs.contains(val)) {
	                    return false;
	                }
	                valeurs.add(val);
	            }
	        }
	        return valeurs.size() == taille;
	    }
	}



