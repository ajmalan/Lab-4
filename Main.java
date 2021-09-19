
/*
Lab 4
Partners: Ayaan Ajmal and Calind Gilson
Date: 19th September
*/
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(51);
    int ogNum = randomNum;
    System.out.println("The Random number is: " + randomNum);
    while (ogNum >= 0) {
      System.out.println(ogNum);
      ogNum--;
    }
    if (randomNum <= 5) {
      System.out.println("Ahoy mateys!");
    } else if (randomNum > 25 && randomNum < 42) {
      System.out.println("Cannonball!");
    } else {
      System.out.println("Blast Off!");
    }
  }
}
