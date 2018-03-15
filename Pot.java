import java.util.*;
import java.lang.Math;

public class Pot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int sum = 0;
    for (int i =0; i < n; i++) {
      int num = input.nextInt();
      int pow = num % 10;
      num /= 10;
      int result = (int)Math.pow(num, pow);
      sum += result;
    }
    System.out.println(sum);
  }
}
