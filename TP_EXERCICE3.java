import java.util.Scanner;

public class TP_EXERCICE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer deux nombres
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        // Demande à l'utilisateur de choisir un opérateur
        System.out.print("Entrez un opérateur (+, -, *, /) : ");
        char operateur = scanner.next().charAt(0);

        double resultat;

        // Effectue l'opération choisie
        switch (operateur) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                // Vérifie la division par zéro
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                } else {
                    System.out.println("Erreur : Division par zéro !");
                    return; // Quitte le programme en cas d'erreur
                }
                break;
            default:
                System.out.println("Opérateur invalide !");
                return; // Quitte le programme en cas d'erreur
        }

        // Affiche le double du résultat
        double doubleResultat = resultat * 2;
        System.out.println("Le double du résultat est : " + doubleResultat);
        
        // Ferme le scanner
        scanner.close();
    }
}


