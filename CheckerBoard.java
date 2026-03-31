public class CheckerBoard {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 7;

        for(int i = 1; i <= rows; i++){

            if(i % 2 == 0){
                System.out.print(" ");
            }

            for(int j = 1; j <= cols; j++){
                System.out.print("# ");
            }

            System.out.println();
        }

    }
}
