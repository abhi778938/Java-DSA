import java.util.*;
public class diagonalTwodarray {
    public static void diagonalSum(int arr[][]) {
        int sumL=0;
        int sumR=0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
         if(i==j){
            sumL=sumL+arr[i][j];
            if(i+j==arr.length-1){
                sumR=sumR+arr[i][j];
            }
         }
            }
        }
        System.out.println("Sum of left diagonal: " + sumL);
        System.out.println("Sum of right diagonal: " + sumR);
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elements of the 3x3 matrix:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        diagonalSum(arr);
        // for(int i=0;i<3;i++) {
        //     for(int j=0;j<3;j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
