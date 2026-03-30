public class Product1ToN{
    public static void main(String[] args) {
        int n;

        for(n = 10; n<= 14; n++){
            int i;
            int product = 1;

            for(i = 1; i <= n; i++){
                product *= i;
            }

            System.out.println("The product from 1 to " +n+ " is: " +product);
        }

    }
}

//------------RESULTS---------------//

// Up to 12, the values are correct. From 13 onwards the value become incorrect
// This is beacause of integer overflow:
//                     -in Java, an int can only store values from -2,147,483,648 to 2,147,483,647
// Since 13 and 14 exceed the int limit, the number wraps around gives wrong values



