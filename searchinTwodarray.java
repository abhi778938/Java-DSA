public class searchinTwodarray {
    public static boolean search(int arr[][], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == k) {
                    return true;
                }
            }
        
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int k=7;
        System.out.println(search(arr, k));
    }
}
