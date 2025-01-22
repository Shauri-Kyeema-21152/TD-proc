import java.util.Scanner;

public class TP_EXERCICE5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un nombre entier positif
        System.out.print("Entrez un nombre entier positif : ");
        int nombre = scanner.nextInt();

        // Vérifie si le nombre est positif
        if (nombre <= 0) {
            System.out.println("Veuillez entrer un nombre entier positif.");
            return; // Quitte le programme si le nombre n'est pas positif
        }

        int somme = 0; // Initialisation de la somme
        int i = 0; // Compteur pour les entiers naturels

        // Calcule la somme des entiers naturels jusqu'à ce qu'elle soit supérieure ou égale au nombre
        while (somme < nombre) {
            i++; // On passe à l'entier suivant
            somme += i; // Ajoute l'entier courant à la somme
        }

        // Affiche le résultat
        System.out.println("La somme des entiers naturels jusqu'à " + i + " est : " + somme);

        // Ferme le scanner
        scanner.close();
    }
}
