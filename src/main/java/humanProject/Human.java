package humanProject;

import humanProject.exceptions.AgeException;
import humanProject.exceptions.EmailException;
import humanProject.exceptions.FirstNameException;
import humanProject.exceptions.SecondNameException;

import javax.naming.NameAlreadyBoundException;
import javax.naming.NotContextException;

public class Human {

    // Create a class called "Human"

    //let the class have attribute of "firstName", "secondName", "age", "phoneNumber", "emailAddress",  "human skills",
    // "human description" and "countryName"


    // create a constructor that returns the objects/attributes or field of the class
    // create a setter method that allows the human change his/her name
    // let the getter method get all human details

    // let the email be a valid email "(okoroaforkelechi1232@gmail.com)" that's a typical valid email
    //  make sure an error is thrown if the email is invalid eg ("okoroaforkelechi113gmail.com") this is an invalid email address

    // control and check that a human must not have numbers in his/her firstname/lastname else let an exception be thrown

    // ******************* UNIT TESTING ******************

    // write a test that checks that the firstname is not valid
    // write a test that checks that the first name is valid
    // write a test that checks that the phone number is valid
    // write a test that checks that the phone number is invalid
    // write a test that checks that the email is valid
    // write a test that checks that the email is invalid
    // write a test that checks that email is valid
    // write a test that checks that the description section will not be empty
    // write a test that checks that age will not be less than '0'
    // write a test that checks that country name is valid
    // write a test that checks that country name is invalid
    // write a test that checks that skills must be a String
    // write a test that checks that skills is invalid


    /* if you can write this program on by yourself... I assure you that there's nothing in JAVA for you to fear about.
    After this program we will solve some exercises in chapter two and push them to git
    Then we will move to python and solve this same project in python if time permits us
    We might moe to c++ and learn from there too... After we have gotten to chapter seven in Java and python

    Then we will start writing Springboot (Java framework), and Django (Python framework) and maybe .Net (c++ framework)

    Then you can successfully tell your Junior that you suffered to get to this stage
    And maybe you too can pick someone who is very low in other cohorts and teach them/.
     */

    private String firstName;
    private String secondName;
    private int age;
    private int phoneNumber;
    private String emailAddress;
    private String skills;
    private String description;

    public  Human(){}

    public Human(String firstName, String secondName, int age, int phoneNumber, String emailAddress, String skills, String description, String countryName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.skills = skills;
        this.description = description;
        this.countryName = countryName;
    }



    public void setFirstName(String firstName) throws FirstNameException {

        if (firstName.contains("1234567890"))
            throw new FirstNameException("Invalid firstname", new NameAlreadyBoundException());
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) throws SecondNameException {
        if (secondName.contains("1234567890"))
            throw new SecondNameException("Incorrect characters", new IllegalStateException());
        this.secondName = secondName;
    }

    public void setAge(int age) throws AgeException {
        if (age<0)
            throw new AgeException("Age is below zero", new IllegalStateException());
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) throws EmailException {
        //if email contains "@gmail.com" or "@yahoo.com", it's correct.

        if (emailAddress.contains("@gmail.com")) {
            System.out.println("gmail is saved to the database.");
        }
        else {
            System.out.println(emailAddress + "@gmail.com");
        }
//
//        if (emailAddress.contains("@yahoo.com")) {
//            System.out.println("valid email");
//        }
//
//        else {
//            System.out.println(emailAddress + "@yahoo.com");
//        }

        if (emailAddress.isEmpty())
            throw new EmailException("This field is required");

        this.emailAddress = emailAddress;

    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private String countryName;


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSkills() {
        return skills;
    }

    public String getDescription() {
        return description;
    }

    public String getCountryName() {
        return countryName;
    }
}

