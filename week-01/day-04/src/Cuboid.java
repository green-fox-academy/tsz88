public class Cuboid {
  public static void main (String[] args) {
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

    double x=10;
    int a = (int) x;
    int surface = a*a*6;
    int volume = a*a*a;
    System.out.println("Surface area: "+surface);
    System.out.println("Volume: "+volume);
  }
}
