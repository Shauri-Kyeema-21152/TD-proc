import java.util.Random;
import java.util.Scanner;

public class TP_EXERCICE8 {

    public static void main(String[] args) {
        // Initialisation du tableau 4x5
        int[][] tableau = new int[4][5];
        Random random = new Random();

        // Remplissage du tableau avec des valeurs aléatoires entre 1 et 100
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = random.nextInt(100) + 1; // Valeurs entre 1 et 100
            }
        }

        // Affichage du tableau sous forme de matrice
        System.out.println("Le tableau est :");
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + "\t"); // Affichage avec tabulation
            }
            System.out.println(); // Nouvelle ligne après chaque ligne du tableau
        }

        // Demande à l'utilisateur d'entrer un nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier à vérifier : ");
        int n = scanner.nextInt();

        // Vérification si le nombre se trouve dans le tableau
        boolean found = false;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] == n) {
                    found = true;
                    break; // Sortir de la boucle si le nombre est trouvé
                }
            }
            if (found) {
                break; // Sortir de la boucle externe si le nombre est trouvé
            }
        }

        // Affichage du résultat
        if (found) {
            System.out.println("Le nombre " + n + " se trouve dans le tableau.");
        } else {
            System.out.println("Le nombre " + n + " ne se trouve pas dans le tableau.");
        }

        // Fermeture du scanner
        scanner.close();
    }
}

