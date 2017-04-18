

import java.util.Scanner;
/**
 * Created by William Yu<br>
 * wwy2286@gmail.com<br>
 * This project is used to create a way to compare two person using the person class<br>
 * 4/17/2017<br>
 *
 */

public class PersonDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter person 1's name");
        String name = keyboard.next();
        String outputAge;
        String outputName;
        System.out.println("Enter person 1's age");
        int age = Integer.parseInt(keyboard.next());
        Person person1 = new Person(name,age);
        System.out.println(person1);
        System.out.println("Enter Person 2's name");
        name = keyboard.next();
        System.out.println("Enter Person 2's age");
        age = Integer.parseInt(keyboard.next());
        Person person2 = new Person(name,age);
        System.out.println(person2);
        if (person1.toString().equals(person2.toString())==true){
            System.out.println("Person 1 equals to Person 2");
        } else {
            System.out.println("Person 1 does not equal to Person 2");
        }
        if (person1.getName().equals(person2.getName())){
            System.out.println("Person 1 does have the same name as Person 2");
        } else {
            System.out.println("Person 1 does not have the same name as Person 2");
        }
        if (person1.getAge()==person2.getAge()){
            outputAge ="Person 1 is the same age as Person 2";
            }
        else if (person1.getAge()>person2.getAge()) {
            outputAge="Person 1 is older than Person 2";
        }
        else {
            outputAge="Person 1 is younger than Person 2";
        }
        System.out.println(outputAge);
    }
}
