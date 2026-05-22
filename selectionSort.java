public class selectionSort {
    public static void sortSelection(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }


    public static void swapAgain(int arr[]){
        for (int i=0;i<=arr.length-2;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max]){
                    max=j;

                }
            
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        swapAgain(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
