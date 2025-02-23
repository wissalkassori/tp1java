package exercice1;

public class ex4 {
	    public static void main(String[] args) {
	        int[][] matrice = {
	            {-2, 1, -3, 4},
	            {-1, 2, 1, -5},
	            {4, -1, 2, 1}
	        };
	        findMaxSubMatrix(matrice);
	    }
	    public static void findMaxSubMatrix(int[][] matrice) {
	        int lignes = matrice.length;
	        int colonnes = matrice[0].length;

	        int maxSomme = Integer.MIN_VALUE;
	        int debutLigne = 0, finLigne = 0, debutCol = 0, finCol = 0;
	        for (int haut = 0; haut < lignes; haut++) {
	            int[] sommeTemp = new int[colonnes];
	            for (int bas = haut; bas < lignes; bas++) {
	                for (int col = 0; col < colonnes; col++) {
	                    sommeTemp[col] += matrice[bas][col];
	                }
	                int[] result = kadane(sommeTemp);
	                int sommeActuelle = result[0];

	                if (sommeActuelle > maxSomme) {
	                    maxSomme = sommeActuelle;
	                    debutLigne = haut;
	                    finLigne = bas;
	                    debutCol = result[1];
	                    finCol = result[2];
	                }
	            }
	        }
	        System.out.println("Sous-tableau maximal :");
	        for (int i = debutLigne; i <= finLigne; i++) {
	            for (int j = debutCol; j <= finCol; j++) {
	                System.out.print(matrice[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("Somme maximale = " + maxSomme);
	    }

	    public static int[] kadane(int[] arr) {
	        int maxSomme = arr[0], sommeCourante = arr[0];
	        int debut = 0, fin = 0, tempDebut = 0;

	        for (int i = 1; i < arr.length; i++) {
	            if (sommeCourante < 0) {
	                sommeCourante = arr[i];
	                tempDebut = i;
	            } else {
	                sommeCourante += arr[i];
	            }
	            if (sommeCourante > maxSomme) {
	                maxSomme = sommeCourante;
	                debut = tempDebut;
	                fin = i;
	            }
	        }

	        return new int[]{maxSomme, debut, fin};
	    }
}
