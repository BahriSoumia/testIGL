import java.util.Vector;

/**
 * Created by Soumia-PC on 14/10/2017.
 */
public class VectorHelper {

    public static Vector<Integer> Inverser(Vector<Integer> vect){
        int i,j,x;
        int n=vect.size();
        i=0;
        j=n-1;
        while(i<j){
            x=vect.get(j);
            vect.add(j, vect.get(i));
            vect.add(i, x);
            i++;
            j--;
        }
        return vect;

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
