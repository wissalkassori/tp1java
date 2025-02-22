package exercice2;

public class ex2 {
    public static void trouverPairesSomme(int[] tableau, int sommeCible) {
        boolean paireTrouvee = false; // Pour vérifier s'il existe au moins une paire
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] + tableau[j] == sommeCible) {
                    System.out.println("(" + tableau[i] + ", " + tableau[j] + ")");
                    paireTrouvee = true;
                }
            }
        }
        if (!paireTrouvee) {
            System.out.println("Aucune paire trouvée avec la somme " + sommeCible);
        }
    }

    public static void main(String[] args) {
        int[] tableau = {2, 7, 4, 5, 9, 1, 6}; // Exemple de tableau
        int sommeCible = 10; // Somme cible à rechercher

        System.out.println("Paires dont la somme est " + sommeCible + " :");
        trouverPairesSomme(tableau, sommeCible);
    }
}
