import java.util.Arrays;
import java.util.Scanner;

public class TP9ProduitMatrice {
    public static void main(String[] args) {
        float matrice_1[][]=new float[4][4];
        float matrice_2[][]=new float[4][4];
        Scanner lecteur = new Scanner(System.in);
        System.out.println("préparer vous à remplir les matrices");
        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 4; p++) {
                System.out.println("entrer le reel de la case "+(i+1)+ ","+(p+1)+" de la matrice_1");
                matrice_1[i][p]=lecteur.nextFloat();
                System.out.println("entrer le reel de la case "+(i+1)+ "," +(p+1)+" de la matrice_2");
                matrice_2[i][p]=lecteur.nextFloat();
            }
        }
         
        float matrice_2_transpo[][]=new float[4][4];

        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 4; p++) {
                matrice_2_transpo[p][i]=matrice_2[i][p];
            }
        }
        
        System.out.println("soient les matrices suivantes ");
        System.out.println(Arrays.deepToString(matrice_1));
        System.out.println(Arrays.deepToString(matrice_2));
        System.out.println("soit la matrices transposé de la 2éme matrice  ");
        for (int i = 0; i < 4; i++) {
            System.out.print("(");
            for (int p = 0; p < 4; p++) {
                System.out.print(matrice_2_transpo[i][p]);
                System.out.print(' ');     
            }
            System.out.print(")");
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrice_2_transpo));
        float matrice_produit[][]=new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 4; p++) {
                matrice_produit[i][p]=matrice_1[i][p]*matrice_2_transpo[i][p];
            }
        }
        //affichage de la matrice produit
        System.out.println("le produit de ces deux matrice est >>>>>");

        for (int i = 0; i < 4; i++) {
            System.out.print("(");
            for (int p = 0; p < 4; p++) {
                System.out.print(matrice_produit[i][p]);
                System.out.print(' ');     
            }
            System.out.print(")");
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrice_produit));
    }
}
