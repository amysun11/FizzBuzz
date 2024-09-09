public class Reduce {

    public static void main(String[] args) {

        int n = 100;
        int count = 0;

        while (n > 0){

            boolean odd = n % 2 != 0;
            boolean even = n % 2 == 0;

            if (odd){
               n = n - 1;
            } else if(even){
                n = n / 2;
            }

            count = count + 1;
        }

        System.out.println(count);
    }
}
