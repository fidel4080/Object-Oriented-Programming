public class For{
    public static void main (String args[]){
        // for (int x = 1; x <= 10; x++){
        //     System.out.println(x);
        // }

        // for (int x = 1; x <= 100; x++){
        //     if(x % 2 == 0){
        //         System.out.println(x);
        //     }
        // }

        // for(int x = 1; x <= 100; x++){
        //     if(x % 3 == 0 && x % 5 == 0){
        //         System.out.println(x);
        //     }
        // }
        

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }

    }
}

