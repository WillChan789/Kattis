import java.util.*;

public class NastyHacks {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i =0; i < n; i++) {
      input = new Scanner(System.in);
      String line = input.nextLine();
      String[] list = new String[3];
      list = line.split(" ");
      int r = Integer.parseInt(list[0]);
      int e = Integer.parseInt(list[1]);
      int c = Integer.parseInt(list[2]);

      if (e-c > r) {
        System.out.println("advertise");
      } else if (e-c == r) {
        System.out.println("does not matter");
      } else if (e-c < r) {
        System.out.println("do not advertise");
      }
    }
  }
}
