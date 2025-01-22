import java.util.Scanner;

public class TP_EXERCICE6 {

    // Fonction pour calculer le discriminant
    public static double calculerDiscriminant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    // Procédure pour afficher les solutions selon le discriminant
    public static void afficherSolutions(double a, double b, double c) {
        double delta = calculerDiscriminant(a, b, c);
        
        System.out.println("Équation à résoudre : " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (delta > 0) {
            // Deux solutions réelles distinctes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Deux solutions réelles distinctes :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Une solution réelle double
            double x = -b / (2 * a);
            System.out.println("Une solution réelle double :");
            System.out.println("x = " + x);
        } else {
            // Pas de solution réelle
            System.out.println("Pas de solution réelle (les solutions sont complexes).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer les coefficients a, b et c
        System.out.print("Entrez le coefficient a (a ≠ 0) : ");
        double a = scanner.nextDouble();

        // Vérification que a n'est pas égal à 0
        while (a == 0) {
            System.out.print("Le coefficient 'a' ne peut pas être égal à 0. Veuillez entrer une valeur valide : ");
            a = scanner.nextDouble();
        }

        System.out.print("Entrez le coefficient b : ");
        double b = scanner.nextDouble();
        
        System.out.print("Entrez le coefficient c : ");
        double c = scanner.nextDouble();

        // Appel de la procédure pour afficher les solutions
        afficherSolutions(a, b, c);

        // Fermeture du scanner
        scanner.close();
    }
}

