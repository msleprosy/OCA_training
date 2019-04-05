package OCAtasks.assesment1.testCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by veronika on 26.03.2019.
 */

/*Since Set interface or HashSet class doesn't provide a get() method to retrieve elements,
the only way to take out elements from a Set is to iterate over it by using Iterator, or
loop over Set using advanced for loop*/

public class SetTest {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Iterator<Integer> itr = set.iterator();

        //ex.1:
        System.out.println("Traversing over Set using Iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //ex.2:
        System.out.println("Traversing over Set using for each:");
        for (Integer elemet : set) {
            System.out.println(elemet);
        }

        //ex.3: just outputting set
        System.out.println("Just outputting set:");
        System.out.println(set);

        //ex.4: deleting via iterator
        System.out.println("Deleting via Iterator");
        //refreshing iterator because it has reached the end of the set:
        itr = set.iterator();
        while (itr.hasNext()) {
            Integer next = itr.next();
            if (next.equals(3)) {
                itr.remove();
            }
        }
        System.out.println(set);

        //ex.4: deleting via for each with EXCEPTION: ConcurrentModificationException
        // This exception is actually throw in the remove method.
        // remove() has to be called after next(). if remove() is called before next(), the size of collection changes.
        /*for (Integer i : set) {
            if (i.equals(3)) {
                set.remove(i);
            }
        }
        System.out.println(set);*/

        for (Integer i : set) {
            if (i.equals(2)) {
                System.out.println("found " + i + " in " + set);
            }
        }
    }
}


