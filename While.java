
public class While{
    public static void main(String args[]) {
        // int x = 1;
        // while(x<=100){ 
        //     System.out.println(x);
        //     x++;
        // }

        // int y = 0;
        // while(y<=100){
        //     if (y%2 == 0) {
        //         System.out.println(y);
        //     }
        //     y++;
        // }

        // int i = 0;
        // while(i<=100){
        //     if(i%3 == 0 && i%5 == 0){ 
        //         System.out.println(i);
        //     }
        //     i++;
        // }

        int num = 2;
        while(num <= 100){
            boolean isPrime = true;
            
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

                i++;
            }

            num++;

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}