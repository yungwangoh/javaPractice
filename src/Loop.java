public class Loop {

    public static void func() {

        int count = 1;

        while (true) {
            System.out.println("count = " + count);
            count++;

            if(count > 100) break;
        }
        System.out.println("Complete.");
    }
}
