import java.util.*;

public class R2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();

    String[] list = line.split(" ");
    int r1 = Integer.parseInt(list[0]);
    int s1 = Integer.parseInt(list[1]);

    int r2 = s1*2-r1;
    System.out.println(r2);
  }
}
