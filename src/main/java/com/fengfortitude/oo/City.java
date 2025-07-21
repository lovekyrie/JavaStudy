/**
 * @author duanyupeng
 * @date 2025年7月15日
 */
package com.fengfortitude.oo;

public class City {
  private String name;
  private double latitude;
  private double longitude;
  

  public static void main(String[] args) {
    City city = new City();
    city.name = "北京市";
    city.latitude = 39.906217;
    city.longitude = 116.407396;
    System.out.println(city.name + " " + city.latitude + " " + city.longitude);
  }
}
