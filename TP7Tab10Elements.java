import java.util.Scanner;
public class TP7Tab10Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] MonTab = new int [10] ; 
        System.out.println(" Entrer les 10 éléments du tableau : ");
        for ( int b = 0; b < MonTab.length ; b++ ){
            System.out.print(+ ( b+1 ) );
            MonTab[b] =  scanner.nextInt(); 

        }
 int somme = 0;
 int produit = 1;
 
 
for (int b = 0; b < MonTab.length; b++){
    somme += MonTab[b];
    produit *= MonTab[b];

}
double moyenne = (double) somme / MonTab.length;
System.out.print("La somme est: " +somme);
System.out.print("Le produit est: " +produit);
System.out.print("La moyenne est: " +moyenne);
}
}