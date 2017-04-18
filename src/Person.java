/**
 * Created by William Yu<br>
 * wwy2286@gmail.com<br>
 * Person Class to create a person with name and age<br>
 * 4/17/2017<br>
 *
 */

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "John";
        this.age = 0;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * Person's Name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Person's Age
     * @param age
     */
    public void setAge(int age){
        this.age= age;
    }

    /**
     *
     * @return person's name
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return Person age
     */
    public int getAge(){
        return age;
    }

    /**
     *
     * @return toString
     */
    public String toString(){
        return "Person's name is " + this.name + "\n" + "Person's age is " + this.age;
    }
}
