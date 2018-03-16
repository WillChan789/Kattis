import java.util.*;
import java.io.*;

public class GrassSeed {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);
      double cost = input.nextDouble();
      int n = input.nextInt();
      double total = 0;
      for (int i =0; i < n; i++) {
        input = new Scanner(System.in);
        String line = input.nextLine();
        String[] list = line.split(" ");
        double x = Double.parseDouble(list[0]);
        double y = Double.parseDouble(list[1]);
        total += x*y*cost;
      }
      System.out.println(total);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
