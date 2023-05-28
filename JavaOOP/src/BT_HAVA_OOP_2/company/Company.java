package BT_HAVA_OOP_2.company;

import BT_HAVA_OOP_2.person.Person;

public class Company {

    static void getPersionInfo(Person person) {
        System.out.println("Name: " + person.getName() +
                ". Age: " + person.getAge() +
                ". Gender: " + person.getGender());
    }
    public static void main(String[] args) {
        Person A = new Person("Trần Đình Tèo", 46, "Male");
        Company.getPersionInfo(A);
    }
}
