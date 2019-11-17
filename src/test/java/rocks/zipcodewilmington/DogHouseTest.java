package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test

    public void addTest() {

        String name = "Otis";
        Date birthday = new Date();
        Dog animal = AnimalFactory.createDog(name, birthday);
        DogHouse.clear();
        Integer expected = DogHouse.getNumberOfDogs() + 1;
        DogHouse.add(animal);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }


    @Test

    public void removeById(){

        Dog dog = new Dog(null,null,9999);
        Dog expectedDog = null;
        DogHouse.remove(9999);
        Assert.assertEquals(expectedDog,DogHouse.getDogById(9999));

    }

    @Test

    public void removeByName() {

        Dog dog = new Dog("Otis", null, 9999);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Assert.assertNull(DogHouse.getDogById(9999));
    }

    @Test

    public void getNumberCatsTest() {

        String name = "Otis";
        Date bDay = new Date();
        Dog animal = AnimalFactory.createDog(name,bDay);
        DogHouse.add(animal);
        Assert.assertEquals((Integer)1,DogHouse.getNumberOfDogs());
    }

}
