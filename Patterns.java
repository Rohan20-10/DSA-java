import java.util.*;
public class Patterns{
    public static void main(String ags[]){
        // Solid Rectangle
        /*  
        *****
        *****
        *****
        *****
            */
        for(int i=0; i<4;i++){ //outer loop
            for(int j=0;j<5;j++){ //inner loop
                System.out.print('*');
            }
            System.out.println();
        }
        
        // Hollow Rectangle
        /*
         *****  * is present when i==1||j==1||i==m||j==n
         *   *
         *   *
         *****
         */

        int m = 4;
        int n = 5;
        for(int i =1;i<=m;i++){
            for(int j=1;j<=n;j++){
                // cell --> (i,j)
                if(i==1 || j==1 || i==m || j==n){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        // Half pyramid
        /*
         *
         **
         ***
         ****  
         */
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        //Inverted Half Pyramid
        /*
         ****
         ***
         **
         * 
         */
        for(int i=m;i>0;i--){ // invert outer loop
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Inverted Half pyramid (rotated by 180 deg)

        /*
            *
           **
          ***
         ****
         */
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){// inner loop to print space
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){// inner loop to print *
                System.out.print('*');
            }
            System.out.println();
        }

        // Mirror img of Inverted half Pyramid
        /*
         ****
          ***
           **
            *        
         */
        for(int i=m;i>0;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // half pyramid with numbers
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        m = 5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //  inverted half pyramid with numbers
        /*
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */

        for(int i=m;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Floyd's Triangle -
        /*
        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
         */
        int counter = 1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+"  ");
                counter++;
            }
            System.out.println();
        }

        // 0-1 Triangle
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */
        // Visualising pattern in a matrix form
        // if for cell; r+c is even then 1
        // if r+c is odd then 0
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ // for even sum
                    System.out.print("1 ");
                }
                else{ // for odd sum
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
        // Advanced pattern
        
        // Butterfly pattern
        /*
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
         */
        m=4;
        for(int i=1;i<=m;i++){ // upper half
            for(int j=1;j<=i;j++){ // left part *
                System.out.print('*');
            }
            for(int j=1;j<=2*(m-i);j++){ // spaces
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){ // right part *
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=m;i>0;i--){ // lower half
            for(int j=1;j<=i;j++){ // left part *
               System.out.print('*'); 
            }
            for(int j=1;j<=2*(m-i);j++){ // spaces
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){ // right part *
               System.out.print('*'); 
            }
            System.out.println();
        }
    }
}