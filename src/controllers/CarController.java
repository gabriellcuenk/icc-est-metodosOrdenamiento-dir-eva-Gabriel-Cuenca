package controllers;

import models.Car;

public class CarController {

  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      for (int j = 0; j < cars.length - 1 - i; j++) {
        if (cars[j].getBrand().compareToIgnoreCase(cars[j + 1].getBrand()) > 0) {
          // compara ambos String y si devuelve un resultado >0 significa que cambia
          Car temp = cars[j];
          cars[j] = cars[j + 1];
          cars[j + 1] = temp;
        }
      }
    }
  }
}