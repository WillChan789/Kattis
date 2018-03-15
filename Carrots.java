import java.util.*;


public class Carrots {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();

    String[] list = line.split(" ");
    int a = Integer.parseInt(list[0]);
    int b = Integer.parseInt(list[1]);

    String[] contestants = new String[a];

    for (int i = 0; i < a; i++) {
      contestants[i] = input.nextLine();
    }
    
    System.out.println(b);
  }
}
