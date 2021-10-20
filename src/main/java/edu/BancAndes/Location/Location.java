package edu.BancAndes.Location;

import java.util.Objects;

public class Location {

  private final String country;
  private final String department;
  private final String city;
  private final String address;

  public Location(String country, String department, String city, String address) {
    this.country = country;
    this.department = department;
    this.city = city;
    this.address = address;
  }

  public String getCountry() {
    return country;
  }

  public String getDepartment() {
    return department;
  }

  public String getCity() {
    return city;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public boolean equals(Object o) {
    var location = (Location) o;
    return Objects.equals(country, location.country) && Objects.equals(department,
        location.department) && Objects.equals(city, location.city)
        && Objects.equals(address, location.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, department, city, address);
  }
}
