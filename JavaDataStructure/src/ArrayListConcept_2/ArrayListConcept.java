package ArrayListConcept_2;
import java.util.ArrayList;

public class ArrayListConcept
{

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>(5);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);


        for (Integer x: number)
            System.out.println(x);


        System.out.println("Array Size = " + number.size());

        number.remove(2);
        for (Integer x : number)
            System.out.println(x);

        number.set(0 , 100); 

        for (Integer x : number)
            System.out.println(x);

    
        number.clear();
    }
}
