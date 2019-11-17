package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);


    }

    @Test
    public void setNameTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        cat.setName("Goku");
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();


        Assert.assertEquals("Goku", retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void speakTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        String blaBla = cat.speak();


        Assert.assertEquals("meow!", blaBla);

    }

    @Test
    public void setBirthDateTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        Date bDay = cat.getBirthDate();


        Assert.assertEquals(givenBirthDate, bDay);
    }

    @Test
    public void setEatTest() {

   Cat cat = new Cat(null,null,null);

   Integer expected = cat.getNumberOfMealsEaten() +1;
   cat.eat(new Food());
   Assert.assertEquals(expected,cat.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){
        Cat cat = new Cat (null,null,999999);
        Integer expected = 999999;
        Integer actual = cat.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isAnimalInheritance(){

        Cat cat = new Cat(null,null,null);
        boolean expected = true;
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void isMammalInheritance() {

        Cat cat = new Cat(null, null, null);
        boolean expected = true;
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected, actual);

    }



}
