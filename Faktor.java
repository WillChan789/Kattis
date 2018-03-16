import java.util.*;

public class Faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        String[] list = line.split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        System.out.println(a*b-(a-1));
    }
}
