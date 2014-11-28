package anshul.jyotu.vidhi.nirav.lambda.functions;

import anshul.jyotu.vidhi.nirav.lambda.collections.Person;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by akd on 28/11/2014.
 */
public class ActionTaker {

    public void callDrivers(List<Person> people, Predicate<Person> p) {
        for (Person person : people) {
            if(p.test(person)) {
                call(person);
            }
        }
    }

    public void emailMid(List<Person> people, Predicate<Person> p) {
        for (Person person : people) {
            if(p.test(person)) {
                email(person);
            }
        }
    }

    public void post(List<Person> people, Predicate<Person> p) {
        for (Person person : people) {
            if(p.test(person)) {
                post(person);
            }
        }
    }

    public void call(Person p) {
        System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
    }

    public void email(Person p) {
        System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
    }

    public void post(Person p) {
        System.out.println("Posting " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress());
    }
}
