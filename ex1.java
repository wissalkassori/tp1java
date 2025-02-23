package exercice1;

public class ex1 {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 2, 1}; 
        int unique = 0; 
        for (int num : tableau) { 
            unique ^= num; 
        }

        System.out.println("Le nombre unique est : " + unique);
    }
}
