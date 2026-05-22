public class revrseRow {
   public static void reverseArray(int arr[][]){
    int row = arr.length;
    int col = arr[0].length;
    for(int i=0;i<row;i++){
    int start=0;
    int end= col-1;
    while(start<end){

        int temp=arr[i][start];
        arr[i][start]=arr[i][end];
        arr[i][end]=temp;
        start++;
        end--;
    }

    
    }
   }
    public static void main(String[] args) {
        int arr[][]={{1,4,5},{2,3,4},{6,7,8}};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
