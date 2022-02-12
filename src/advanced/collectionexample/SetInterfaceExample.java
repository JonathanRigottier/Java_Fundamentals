package advanced.collectionexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
        //Hash example 1

        /*Set<String> name = new HashSet<String>();

        //Add elements
        name.add("Bob");
        name.add("Anna");
        name.add("Matheo");
        name.add("Zev");
        name.add("Liza");
        name.add("Liza");

        System.out.println(name);

        //Remove
        name.remove("Bob");
        System.out.println(name);

        //Size
        System.out.println(name.size());

        //Contains
        System.out.println(name.contains("Liza"));

        //Iterate
        for(String names: name){
            System.out.println(names);
        }

        Iterator<String> i = name.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
         */

        Set<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println(intSet1);

        Set<Integer> intSet2 = new HashSet<Integer>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        //Find union
        Set<Integer> union = new HashSet<Integer>(intSet1);
        System.out.println("Union : " + union);
        union.addAll(intSet2);
        System.out.println("Union after adding intSet2 : " + union);

        //Find intersection
        Set<Integer> intersection = new HashSet<Integer>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection : " + intersection);

        //Find difference
        Set<Integer> difference = new HashSet<Integer>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("Unique elements in intSet1 : " + difference);
    }
}
