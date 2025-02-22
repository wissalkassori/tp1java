package exercice1;

public class ex1 {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 2, 1}; // Exemple de tableau
        int unique = 0; 

        // Utilisation de XOR pour trouver l'élément unique
        for (int num : tableau) { 
            unique ^= num; 
        }

        System.out.println("Le nombre unique est : " + unique);
    }
}
