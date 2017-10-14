import java.util.Vector;

/**
 * Created by Soumia-PC on 14/10/2017.
 */

/**
 *Classe qui contient des fonctions pour la manipulation des vecteurs
 * @author Soumia
 * @version  1.0
 *
 */
public class VectorHelper {

    /**
     * Inserser les elements d'un vecteur d'entiers
     *
     * @param vect
     *              vecteur des entiers
     * @return retourne un vecteur dant les elements sont inverses
     */

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

    /**
     * Trier les elements d'un vecteur par ordre croissant
     *
     * @param vect vecteur des entiers
     */

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
