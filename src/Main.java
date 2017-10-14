import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vector<Integer> vect = new Vector<Integer>();
        vect.add(0, 1);
        vect.add(1,3000 );
        vect.add(2, 700);
        vect.add(3, 711);
        vect.add(4, 12);
        vect.add(5, 903);
        vect.add(6, 22);
        vect.add(7, 251);
        vect.add(8, 53);
        int u=0;

        Vector<Integer> vect2 = VectorHelper.Inverser(vect);

        for(int i=0; i<vect2.size(); i++){
            System.out.println(vect2.get(i));
        }



        System.out.println("\n");
    }
}
