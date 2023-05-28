package BT_HAVA_OOP_2.person;

public class Information {

    static void getPersionInfor(Person person) {
        System.out.println("Name: " + person.getName() +
                ". Age: " + person.getAge() +
                ". Gender: " + person.getGender() +
                ". Address: " + person.getAddress() +
                ". Phone: " + person.getPhone());
    }
    static public void main(String[] args) {
        Person A = new Person("Tào Thị Tý", 20, "Female", "Indo", "0123456789");
        Information.getPersionInfor(A);
    }
}
