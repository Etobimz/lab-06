package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CityListTest {

    private CityList mockCityList() {
            CityList cityList = new CityList();
            cityList.add(mockCity());
            return cityList;

    }





    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }



    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }



    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }


    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
// This line checks if the first city in the cityList (retrieved by cityList.getCities().get(0))
// is the same as the city returned by mockCity()
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
// This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
// Now the original city should be at position 1
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }





    @Test
    void testHasCity() {

        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        // Create a city object identical to the one in the list.
        City existingCity = new City("Edmonton", "Alberta");
        assertTrue(cityList.hasCity(existingCity));

        City nonExistingCity = new City("Regina", "Saskatchewan");
        assertFalse(cityList.hasCity(nonExistingCity));

        assertFalse(cityList.hasCity(null));
    }




    @Test
    void  testDelete() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City existingCity = new City("Edmonton", "Alberta");
        cityList.delete(existingCity);

        assertEquals(0, cityList.getCities().size());
        assertFalse(cityList.hasCity(existingCity));

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(new City("Regina", "Saskatchewan"));
        });
    }




    @Test
    void testSize() {// 1. Test initial size after creation
        CityList cityList = new CityList(); // Create a new, empty list
        assertEquals(0, cityList.size()); // Assuming you have a cityList.size() method

        // 2. Test size after adding one city
        cityList.add(new City("Edmonton", "Alberta"));
        assertEquals(1, cityList.size());

        // 3. Test size after adding another city
        cityList.add(new City("Calgary", "Alberta"));
        assertEquals(2, cityList.size());

        // 4. Test size after deleting a city
        cityList.delete(new City("Edmonton", "Alberta"));
        assertEquals(1, cityList.size());
    }







}
