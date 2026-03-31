public class PrintPatterns {
    static void pattern1(){
        for(int rows = 1; rows <= 8; rows++){

            for(int cols = 1; cols <= rows; cols++){

                System.out.print("# ");
            }

            System.out.println();
        }
    }

    static void pattern2(){
        for(int rows = 1; rows <= 8; rows++){

            for(int cols = 8; cols >= rows; cols--){
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    static void pattern3(){
        for(int rows = 1; rows <= 8; rows++){

            for(int spaces = 1; spaces <= (rows -1); spaces++){
                System.out.print("  ");
            }

            for(int cols = 8; cols >= rows; cols--){
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    static void pattern4(){
        for(int rows = 1; rows <= 8; rows++){

            for(int spaces = 7; spaces >= (rows - 1); spaces--){
                System.out.print("  ");
            }

            for(int cols = 1; cols <= rows; cols++){
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    static void pattern5(){
        for(int rows = 1; rows <= 7; rows++){
            for(int cols = 1; cols <= 7; cols++){

                if(rows == 1 || rows == 7 || cols == 1 || cols ==7){
                    System.out.print("# ");
                }

                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        pattern5();

    }
}

