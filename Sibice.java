import java.util.*;
import java.lang.Math;

public class Sibice {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();

    String[] list = line.split(" ");
    int n = Integer.parseInt(list[0]);
    int x = Integer.parseInt(list[1]);
    int y = Integer.parseInt(list[2]);
    int max = (int)Math.sqrt(x*x+y*y);
    for (int i =0; i < n; i++) {
      int num = input.nextInt();
      if (num <= max) {
        System.out.println("DA");
      } else {
        System.out.println("NE");
      }
    }
  }
}
