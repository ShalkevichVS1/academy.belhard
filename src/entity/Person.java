package entity;

public class Person {
    protected String  firstName;
    protected String  lastName;

    public Person(){

    }

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        String firsLastName = firstName + " " + lastName;
        return firsLastName;
    }
}
