public class SumAndAverage {
    public static void main(String[] arg){
        int num;
        int sum = 0;
        double average;

        for(num = 1; num <= 100; num++){
            sum += num;
        }

        average = sum / 100.0;

        System.out.println("The sum is " +sum);
        System.out.println("The average is " +average);

    }
}
