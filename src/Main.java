import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vector<Integer> vect = new Vector<Integer>();
        System.out.println(vect.size());
        vect.add(0, 1);
        vect.add(1,200 );
        vect.add(2, 700);
        System.out.println(vect.size());
         VectorHelper.Inverser(vect);
        System.out.println(vect.size());
        for(int i=0; i<vect.size(); i++){
            System.out.println(vect.get(i));
        }


        System.out.println("\n");
    }
}
