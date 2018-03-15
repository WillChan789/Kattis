import java.util.*;

public class Autori {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();

    String[] list = line.split("-");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i].substring(0,1));
    }
  }
}
