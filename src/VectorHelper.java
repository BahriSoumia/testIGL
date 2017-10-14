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

    public static void Inverser(Vector<Integer> vect){
        int i=0,x=0;
        int j=vect.size()- 1;
        while (i<j ){
            x = vect.get(j);
            vect.setElementAt( vect.get(i),j);
            vect.setElementAt(x, i);
            i++;
            j--;
        }


    }


/* par bull */

    /**
     * Trier les elements d'un vecteur par ordre croissant
     *
     * @param vect vecteur des entiers
     */

    public static Vector<Integer> triBulleCroissant(Vector<Integer> vect) {
        int longueur = vect.size();
        int tampon = 0;
        boolean permut ;
        int i;
        do{

            permut = false ;
            for ( i = 0; i < longueur - 2; i++) {
                int elemi=vect.get(i);
                int elemii=vect.get(i+1);
                // Teste si 2 éléments successifs sont dans le bon ordre ou non
                if (elemi > elemii) {
                    // s'ils ne le sont pas, on échange leurs positions
                    tampon = elemi;
                    vect.setElementAt( elemii,i);
                    vect.setElementAt(tampon,i+1);
                    permut = true;
                }

            }
        } 	while (permut && (i<longueur-1)) ;
        return vect;
    }

}
