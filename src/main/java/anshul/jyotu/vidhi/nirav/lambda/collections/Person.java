package anshul.jyotu.vidhi.nirav.lambda.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by akd on 28/11/2014.
 */
public class Person {

    private String givenName;
    private String surName;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;

    public Person(String givenName, String surName, int age, String gender, String email, String phone, String address) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static List<Person> createDefaultList() {
        List<Person> list = new LinkedList<Person>();

        Random r = new Random();
                
        Person p1 = new Person("Anshul", "Dutta", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");
        Person p2 = new Person("Jyoti", "Dutta", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");
        Person p3 = new Person("Vidhi", "Dutta", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");
        Person p4 = new Person("Nirav", "Dutta", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");
        Person p5 = new Person("Skasham", "Garg", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");
        Person p6 = new Person("Sakshi", "Garg", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");
        Person p7 = new Person("Durlabh", "Raghuvanshi", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");
        Person p8 = new Person("Dipti", "Raghuvanshi", r.nextInt(100), "M", "a@b.c", "01234", "In the Mumbai");


        list.add(p4);
        list.add(p7);
        list.add(p1);
        list.add(p2);
        list.add(p5);
        list.add(p6);
        list.add(p3);
        list.add(p8);

        return list;
    }

    @Override
    public String toString() {
        return getGivenName() + " " + getSurName();
    }
}
