import java.util.Scanner;

public class TP4AffichageNombre {
    public static void main(String[] args) {
        int i, A, N;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" entrer le nombre de départ: ");
        A =  scanner.nextInt();
        System.out.print(" entrer les nombres de retour en arriere: ");
        N =  scanner.nextInt();
       
            System.out.println(" les "+N+"  nombres précédents de "+A+" sont: ");
            for ( i = 1; i<= N; i++){
            
                System.out.println(A -i);     
        } 
         
}
}