//1. importation de la bibliotheque
import java.util.Scanner;

//2. declaration de la classe principale
public class TP1ConvertTemps {

    //3. point d'entree du programme
    public static void main(String[] args) {
        int a,b,c,d;

        //4.saisi utilisateurs
        Scanner seconde = new Scanner (System.in);
        System.out.println("Entrez le nombre de secondes à convertir: ");
        d = seconde.nextInt();
        c = (d/3600) ;
        b = (d%3600)/60 ;
        a =  (d%3600)%60 ;

        //5. affichage des resultats 
        System.out.println("le nombre d'heures est : "+c+" heure(s)");
        System.out.println("le nombre de minutes est : "+b+" minute(s)");
        System.out.println("le nombre de secondes est : "+a+" seconde(s)");  

        
    }
    
}
