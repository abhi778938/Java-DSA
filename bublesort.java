
public class bublesort {
    public static void sortbubble(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
             boolean swapped= false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }

            }
            if(swapped==false){
                break;
            }

        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int number[]={5,4,1,3,2};
        sortbubble(number);
        printArr(number);
    }


}
