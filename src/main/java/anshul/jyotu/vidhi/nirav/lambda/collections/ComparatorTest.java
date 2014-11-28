package anshul.jyotu.vidhi.nirav.lambda.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

/**
 * Created by akd on 28/11/2014.
 */
public class ComparatorTest {

    public static void main(String[] args) {

        List<Person> theList = Person.createDefaultList();

        System.out.println("Before:");
        for (Person person : theList) {
            System.out.println(person);
        }
        sort(theList, (Person p1, Person p2) -> p1.getGivenName().compareTo(p2.getGivenName()));

        System.out.println();
        System.out.println("After:");
        for (Person person : theList) {
            System.out.println(person);
        }

    }
}
