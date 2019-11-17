package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test

    public void setspeakTest(){
        Dog dog = new Dog(null,null,null);
        String expexted = "bark!";
        String actual = dog.speak();
        Assert.assertEquals("bark!", actual);
    }

    @Test

    public void getNameTest() {
        Dog dog = new Dog("Otis", null, null);
        String expected = "Otis";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void getBdayTest() {
        Dog dog = new Dog(null, new Date(), null);
        Date expected = new Date();
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void getEatTest() {
        Dog dog = new Dog(null, null, null);
        Integer expected = dog.getNumberOfMealsEaten() +1;
        dog.eat(new Food());
        Assert.assertEquals(expected,dog.getNumberOfMealsEaten());
    }

    @Test

    public void getIdTest() {
        Dog dog = new Dog(null, null, 888);
        Integer expected = 888;
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isAnimalInheritance(){

        Dog dog = new Dog(null,null,null);
        boolean expected = true;
        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isMammalInheritance() {

        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected, actual);

    }

}
