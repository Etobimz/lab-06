package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** *This is a class that keeps a list of city objects  */
public class CityList {


    private List<City> cities = new ArrayList<>();



    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }


        cities.add(city);
    }



/**
 * This returns a sorted list of cities
 * @return
 * Return the sorted list
 */
public List<City> getCities() {
    List<City> list = cities;
    Collections.sort(list);
    return list;
}







/**
 *  When given a city, return whether or not it belongs in the list
 * @param city
 * This is a candidate city to check if it belongs in the list

 * @return
 * Return true if the city is in the list
 */
public boolean hasCity(City city) {
    return cities.contains(city);

}










/**
 *  When given a city, delete the city from the list

 * @param city
 * This is a candidate city to delete from the list

 */




public void delete(City city) {
    // First, check if the list contains the city.
    // The contains() method will use the equals() method you just implemented.
    if (!cities.contains(city)) {
        // If the city is NOT in the list, throw the exception that your test is looking for.
        throw new IllegalArgumentException("The city to be deleted does not exist in the list.");
    }
    // If the city IS in the list, then remove it.
    cities.remove(city);
}





/**
 * This returns the amount of cities in the list

 * @return
 * Return the amount of cities in the list

 */

public int size() {
    return cities.size();
}





}







