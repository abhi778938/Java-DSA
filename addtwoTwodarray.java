public class addtwoTwodarray {
    public static void subarray(int arr[][]){
        int row =arr.length;
        int col=arr[0].length;
        int rowIdx=-1;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
               if(sum>maxSum){
                maxSum=sum;
                rowIdx=i;

               }
            }
        }
        System.out.println("the maximum sum is " + maxSum);
        System.out.println("the row index is " + rowIdx);
        
    }
    public static void main(String[] args) {
          int arr1[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
          int arr2[][]={{2,9,8},{4,8,6},{7,6,9},{10,41,12}};
          int ans[][]=new int[4][3];
        // System.out.println(subarray(arr1
        subarray(arr1);
        //   for(int row=0;row<4; row++){
        //     for(int col=0;col<3;col++){
        //        ans[row][col]=arr1[row][col]+arr2[row][col];
        //     }
        //   }
        //   for(int row=0;row<4; row++){
        //     for(int col=0;col<3;col++){
        //        System.out.print(ans[row][col] + " ");

        //     }
        //     System.out.println();
        //   }
     }
}
