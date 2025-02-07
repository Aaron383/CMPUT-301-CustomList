

import static org.junit.jupiter.api.Assertions.*;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }


    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }


    @Test
    public void deleteTest() {
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(1, list.getCount());
        list.deleteCity(city);
        assertFalse(list.hasCity(city));

    }


    @Test
    public void countCitiesTest() {
        City city = new City("Halifax", "NS");
        list.addCity(city);

        assertEquals(1, list.countCities());
    }



}
