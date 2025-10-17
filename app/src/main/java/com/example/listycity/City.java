package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a city
 */
public class City implements Comparable {

    private String city;
    private String province;

    /**
     * This is a constructor
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This is a getter method
     */
    public String getCityName() {
        return city;
    }

    /**
     * This is a getter method
     */
    public String getProvince() {
        return province;
    }

    /**
     * This is a setter method
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This is a setter method
     */
    public void setProvince(String province) {
        this.province = province;
    }




    /**
     * Compare two cities alphabetically by their name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }




    /**
     * Checks if two City objects are equal based on their city and province names.
     * @param o The object to compare against.
     * @return True if the cities have the same name and province, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * Generates a hash code for the City object based on its content.
     * Required when overriding the equals() method.
     * @return An integer hash code.
     */

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

}








