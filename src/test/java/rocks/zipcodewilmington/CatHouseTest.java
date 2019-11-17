package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.omg.DynamicAny.DynArray;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


@Test

    public void addTest() {

    String name = "Milo";
    Date birthday = new Date();
    Cat animal = AnimalFactory.createCat(name, birthday);
    CatHouse.clear();
    Integer expected = CatHouse.getNumberOfCats() + 1;
    CatHouse.add(animal);
    Assert.assertEquals(expected, CatHouse.getNumberOfCats());
}


@Test

    public void removeById(){

    Cat cat = new Cat(null,null,9999);
    Cat expectedCat = null;
    CatHouse.remove(9999);
    Assert.assertEquals(expectedCat,CatHouse.getCatById(9999));

}

    @Test

    public void removeByName() {

        Cat cat = new Cat("Milo", null, 9999);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertNull(CatHouse.getCatById(9999));
    }

    @Test

    public void getNumberCatsTest() {

        String name = "Milo";
        Date bDay = new Date();
        Cat animal = AnimalFactory.createCat(name,bDay);
        CatHouse.add(animal);
        Assert.assertEquals((Integer)1,CatHouse.getNumberOfCats());
    }

}








