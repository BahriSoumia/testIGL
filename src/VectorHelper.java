import java.util.Vector;

/**
 * Created by Soumia-PC on 14/10/2017.
 */


public class VectorHelper {

    public int[] Inverser(Vector<Integer> vect,int k ) {
        int i, j, x;
        int n = vect.size();
        i = 0;
        j = n-1 ;
        int [] tab = new int[vect.size()];
        for ( i=0 ; i < vect.size();i++){
            tab[i] = vect.get(j);
            j--;

        }
        for ( i =0 ; i < tab.length;i++)
        {
            vect.add(i,tab[i]);
            System.out.print("--"+vect.get(i));
        }

        return tab;
    }
/* par bull */

    
   
    public static void triBulleCroissant(Vector<Integer> vect) {
        int longueur = vect.size();
        int tampon = 0;
        boolean permut ;

        do{
            permut = false ;
            for (int i = 0; i < longueur; i++) {
                // Teste si 2 éléments successifs sont dans le bon ordre ou non
                if (vect.get(i) > vect.get(i+1)) {
                    // s'ils ne le sont pas, on échange leurs positions
                    tampon = vect.get(i);
                    vect.add(i, vect.get(i+1));
                    vect.add(i+1, tampon);
                    permut = true;
                }

            }
        } 	while (permut) ;
    }
}
