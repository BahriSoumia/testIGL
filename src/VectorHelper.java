import java.util.Vector;

/**
 * Created by Soumia-PC on 14/10/2017.
 */


public class VectorHelper {

    public int[] Inverser(Vector<Integer> vect) {
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

    
   
   
}
