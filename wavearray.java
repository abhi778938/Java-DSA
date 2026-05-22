   public class wavearray{

      public static void waveArray(int arr[][]){
         int row=arr.length;
         int col=arr[0].length;
         for(int j=0;j<col;j++){
            if(j%2==0){
               for(int i=0;i<row;i++){
                  System.out.print(arr[i][j]+" ");
               }
            }else{
               for(int i=row-1;i>=0;i--){
                  System.out.print(arr[i][j]+" ");
               }
            }
         }
      }
    public static void main(String[] args) {
       int arr[][]={{1,3,5,7},{2,4,6,8},{9,11,12,13}};
       waveArray(arr);
    }
   } 