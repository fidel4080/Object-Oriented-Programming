public class PrintPatterns {
    static void pattern1(){
        for(int rows = 1; rows <= 8; rows++){

            for(int cols = 1; cols <= rows; cols++){

                System.out.print(" #");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern1();
    }
}

