package models;

public class Car {

  private int year;
  private String brand;

  public int getYear() {
    return year;
  }

  public String getName() {
    return brand;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Car(String brand, int year) {
    this.year = year;
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Car [year=" + year + ", brand=" + brand + "]";
  }

  
}
