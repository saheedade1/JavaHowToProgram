package humanProject;

import humanProject.exceptions.EmailException;
import humanProject.exceptions.FirstNameException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {


    @Test
    public void incompleteEmailTest() throws EmailException {
        Human human = new Human();
        human.setEmailAddress("adex");
        Assertions.assertEquals("adex", human.getEmailAddress());
    }


    @Test
    public void emptyEmailAddressTest() throws EmailException {
        Human human = new Human();
        human.setEmailAddress("");
        Assertions.assertEquals("", human.getEmailAddress());
    }

    @Test
    public void incorrectFirstName() throws FirstNameException {
        Human human = new Human();
        human.setFirstName("Ade1");
        Assertions.assertEquals("Ade1", human.getFirstName());
    }
}