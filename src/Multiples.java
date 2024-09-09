public class Multiples {

    public static void main(String[] args) {

        int i = 1;
        int count = 0;
        while (i < 1000){

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                count += 1;

            } else if (divisibleBy3) {

                count += 1;

            } else if (divisibleBy5) {

                count += 1;

            }
            i = i + 1;

        }
        System.out.println(count);
    }
}
