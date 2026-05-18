package controllers;

import models.Car;

public class CarController {
  boolean intercambio;

  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      intercambio = false;
      for (int j = 0; j < cars.length - 1 - i; j++) {
        if (cars[j].getName().compareTo(cars[j + 1].getName()) > 0) {
          // compara ambos String y si devuelve un resultado >0 significa que cambia
          intercambio = true;
          Car temp = cars[j];
          cars[j] = cars[j + 1];
          cars[j + 1] = temp;
        }
      }
      if (!intercambio) {
        break;
      }
    }
  }
}