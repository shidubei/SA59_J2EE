package iss.nus.shidu.functional.program.stream.Example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int kids;

    public Person(String firstName, String lastName, int age, int kids) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.kids = kids;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age + " " + this.kids;
    }

    public static List<Person> generatePersonList(){
        List<Person> l = new ArrayList<>();

        l.add(new Person("John", "Tan", 32, 2));
        l.add(new Person("Jessica", "Lim", 28, 3));
        l.add(new Person("Mary", "Lee", 42, 2));
        l.add(new Person("Jason", "Ng", 33, 1));
        l.add(new Person("Mike", "Ong", 22, 0));
        return l;
    }

    public static void transforming(){
        List<Person> persons = generatePersonList();
        persons.stream().sorted(Comparator.comparing(Person::getFirstName)).map(x->x.getFirstName()+" "+x.getLastName())
                .forEach(System.out::println);
    }

    public static void transforming2(){
        int[] arr = {0,1,2,3,4,5};
        IntStream.of(arr).map(e->e*2).forEach(e->System.out.print(e+" "));
    }
    public static void transforming3(){
        String[] arr = {"aa","bb","cc","dd"};
        Arrays.stream(arr).map(String::toUpperCase).forEach(e->System.out.print(e+" "));
    }
    public static void transforming4(){
        String[] names = {"John","Jessica","Mary","Jason","Mike"};
        int maxLength = Stream.of(names).mapToInt(x->x.length()).max().getAsInt();
        System.out.println("name with max length is "+ maxLength);
    }
    public static void main(String[] args) {
        transforming();
        transforming2();
        transforming3();
        transforming4();
    }
}
