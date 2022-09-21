import java.util.Scanner;

public class Conditional {

    public static void func() {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int d = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(d);
    }
}
