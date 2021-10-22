public class AdvancePatterns12 {



    public void hello(){
        System.out.println("HELLO, WORLD");
    }


    // Advance Pattern 1.
    //         *         
    //       *   *          
    //     *   *   *   
    //   *   *   *   *

    // public static void main(String[] args) {
    //     int n = 8;
    //     for (int i = 1; i <= n; i++) {

    //         for (int j = 1; j <= n-i; j++){
    //             System.out.print("  ");
    //         }

    //         for(int j = 1; j <= i; j++){
    //             System.out.print("*   ");
    //         }
    //         System.out.println();

    //     }
    // }





// ---------------------------------------------------------

    


    // Advance Pattern 2.
    //          1
    //       2     3
    //     4    5    6
    //  7    8     9   10

    // public static void main(String[] args) {
    //     int n = 8;
    //     int number = 1;
    //     for (int i = 1; i <= n; i++) {

    //         for (int j = 1; j <= n-i; j++){
    //             System.out.print("    ");
    //         }

    //         for(int j = 1; j <= i; j++){
    //             System.out.print(number++ +"      ");
    //         }
    //         System.out.println();

    //     }

    // }











// ---------------------------------------------------------------------


    // Advance Pattern 3.
    // *
    // * *
    // * * *
    // * * * *
    // * * *
    // * *
    // *


    // public static void main(String[] args) {
    //     int n = 8;
    //     int rows = 2*n-1;
    //     for(int i = 1; i <= rows; i++) {

    //         if(i <= n){
    //             for (int j = 1; j <= i; j++) {
    //                 System.out.print("* ");
    //             }

    //         }else{
    //             for(int j = 1; j <= rows-i+1; j++) {
    //                 System.out.print("* ");
    //             }
    //         }
    //         System.out.println();

    //     }
    // }









// ---------------------------------------------------------------------------------


    // Advance Pattern 4.
    //  *
    //  *  *
    //  *    *
    //  *      *
    //  *  *  *  * 

    // public static void main(String[] args) {
    //     int n = 10;
    //     System.out.println("*");

    //     for(int i = 2; i<=n-1; i++){
    //         System.out.print("* ");
    //         for(int j = 1; j<=i-2; j++){
    //             System.out.print("  ");
    //         }
    //         System.out.println("* ");
    //     }
    //     if(n>1)
    //         for(int i = 1; i <= n; i++) {
    //             System.out.print("* ");
    //         }
    // }










// -------------------------------------------------------
    // Advance Pattern 5.
    // * * * * * * 
    //       * * * * *
    //            * * * *
    //                 * * *
    //                     * *
    //                         *



    // public static void main(String[] args) {

    //     int n = 5;

    //     for (int i = 1; i <= n; i++) {

    //         for (int j = 1; j <= i-1; j++) {
    //             System.out.print("    ");
    //         }

    //         for (int j = 1; j <= n-i+1; j++) {
    //             System.out.print(" *");
    //         }
    //         System.out.println();
    //     }
    // }












// --------------------------------------------------------------- 

    // Advance Pattern 6.
    //             *
    //           * *
    //         * * *
    //       * * * *
    //         * * *
    //           * *
    //             *


    // public static void main(String[] args) {
    //     int n = 5;

    //     int rows = 2*n-1;
    //     for(int i = 1; i <= rows; i++) {
    //         for(int j = 1; j <= n; j++) {
    //             System.out.print("  ");
    //         }

    //         if(i <= n){
    //             for (int j = 1; j <= i; j++) {
    //                 System.out.print("* ");
    //             }

    //         }else{
    //             for(int j = 1; j <= rows-i+1; j++) {
    //                 System.out.print("* ");
    //             }
    //         }
    //         System.out.println();

    //     }



    // }



// -----------------------------------------------------------------


    // PATTERN NUMBER 1.
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // public static void main(String[] args) {
    //     // But we need to take user input of how many lines we need to print.
    //     int n = 7;

    //     for (int i = 0; i <= n; i++){
    //         for(int j = 0; j <= n; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    // }





// ------------------------------------------------------------------------------


    // PATTERN 2.
    // * 
    // * *
    // * * *
    // * * * *
    // public static void main(String[] args) {
    //     int n = 10;
    //     for (int i = 1; i <= n; i++){
    //         for (int j = 1; j <= i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }





// ---------------------------------------------------------------------------------



    // PATTERN 3.
    // * * * *
    //   * * *
    //     * *
    //       *
    // public static void main(String[] args) {
    //     int n = 10;

    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i-1; j++) {
    //             System.out.print("  ");
    //         }
    //         for (int j = 1; j <= n-i+1; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    





// -------------------------------------------------------

    // PATTERN 4.
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // public static void main(String[] args) {
    //     int n = 10;
        
    //     for (int i = 1; i <= n; i++){
    //         for (int j = 1; j <= n-i+1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }






// ---------------------------------------------------------
    
    // PATTERN 5.
    // * * * * * * 
    //   * * * * * * 
    //     * * * * * * 
    //      * * * * * * 
    //        * * * * * * 

    // public static void main(String[] args) {
    //     int n = 5;

    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i-1; j++) {
    //             System.out.print("  ");
    //         }
    //         for (int j = 1; j <= n+1; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }







// -----------------------------------------------------------
    
    // PATTERN 6.
    //          *
    //        * *
    //      * * *
    //    * * * *
    //  * * * * *


    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        // int n = 10;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }



}


