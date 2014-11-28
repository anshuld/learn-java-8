package anshul.jyotu.vidhi.nirav.lambda.functions;

import anshul.jyotu.vidhi.nirav.lambda.collections.Person;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by akd on 28/11/2014.
 */
public class PredicateTest {

    public static void main(String[] args) {

        List<Person> people = Person.createDefaultList();

        Predicate<Person> drivers = (Person p) -> p.getAge() >=18 && p.getAge() < 25;
        Predicate<Person> men = (Person p) -> p.getAge() >=25 && p.getAge() < 40 && p.getGender() == "M";
        Predicate<Person> pilots = (Person p) -> p.getAge() >40;

        ActionTaker action = new ActionTaker();

        action.callDrivers(people, drivers);
        action.emailMid(people, men);
        action.post(people, pilots);
    }
}
