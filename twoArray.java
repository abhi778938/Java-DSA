import java.util.Scanner;

public class twoArray {
    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // int row = matrix.length;
        // int col = matrix[0].length;

        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i <row; i++) {
        //     for (int j = 0; j <col; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         System.out.print(matrix[i][j]+ " ");
        //     }
        //     System.out.println();
        // }



        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       int n =arr.length;
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
