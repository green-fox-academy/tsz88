package com.greenfox;

import java.util.HashMap;
import java.util.Map;

public class Basket {
  public Map<Integer, Integer> books;
  int howManySet5Discounts = 0;
  int howManySet3Discounts = 0;

  public Basket() {
    books = new HashMap<>();
  }

  public double calculateFullPrice() {
    double sum = 0;
    for (int book : books.values())
      sum += book * 8;
    return sum;
  }

  public double calculate5SetDiscount() {
    double discount = 0;
    while (books.size() == 5) {
      discount += 10;
      removeOneBookFromEachVolume();
      removeZeroValues();
      howManySet5Discounts += 1;
    }
    return discount;
  }

  public double calculate4SetDiscount() {
    double discount = 0;
    while (books.size() == 4) {
      discount += 6.4;
      removeOneBookFromEachVolume();
      removeZeroValues();
    }
    return discount;
  }

  public double calculate3SetDiscount() {
    double discount = 0;
    while (books.size() == 3) {
      discount += 2.4;
      removeOneBookFromEachVolume();
      removeZeroValues();
      howManySet3Discounts += 1;
    }
    return discount;
  }

  public double calculate2SetDiscount() {
    double discount = 0;
    while (books.size() == 2) {
      discount += 0.8;
      removeOneBookFromEachVolume();
      removeZeroValues();
    }
    return discount;
  }

  public double calculateDiscountPrice() {
    double discountPrice = calculateFullPrice() - calculate5SetDiscount() - calculate4SetDiscount() - calculate3SetDiscount() - calculate2SetDiscount();
    if (howManySet3Discounts>0 && howManySet5Discounts>0){
      int set5set3Combinations = 0;
      if (howManySet3Discounts >= howManySet5Discounts){
        set5set3Combinations = howManySet3Discounts;
      } else {
        set5set3Combinations = howManySet5Discounts;
      }

      discountPrice -= 0.4 * set5set3Combinations;
    } return discountPrice;
  }

  public void removeZeroValues() {
    while(books.values().remove(0));
  }

  public void removeOneBookFromEachVolume(){
    for (Integer bookTitle : books.keySet()) {
      if (books.get(bookTitle) > 0)
        books.put(bookTitle, books.get(bookTitle) - 1);
    }
  }

}
