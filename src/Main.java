public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task 3

        int year = 0;
        int start = 1822;
        int finish = 2100;
        for (year = 0; year < 2100; year = year + 79) {
            if (year > start && year < finish) {
                System.out.println(year);
            }
        }

    }
}
