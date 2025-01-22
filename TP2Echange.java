import java.util.Scanner;
public class TP2Echange {
    
    public static void main(String[] args) {

        // Declaration des variables
    int n1, n2, n3;
    Scanner scanner = new Scanner(System.in);
    System.out.print(" entrer le premier nombre à permuter: ");
    n1 =  scanner.nextInt();
    System.out.print(" entrer le second nombre à permuter: ");
    n2 =  scanner.nextInt();
     int produit = n1*n2;
     int addition = n1+n2;

     // Structures conditionnelles 
     if (produit < 0) {
        n1 = n2;
        n3 = n1;
        n3 = n2;
        System.out.println(" le premier nombre est n1 = "+n1+" et le second nombre est n2 = "+n2);
     }
     else { System.out.println(" la somme est : "+addition+" et le produit est :" +produit );}  
}


}