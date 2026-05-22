public class segregate {

    public static void segregateProb(int num[]) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        for(int i=0;i<count0;i++){
            num[i]=0;
        }
        for(int i=count0;i<num.length;i++){
            num[i]=1;
        }
        // System.out.println(count0+count1);
    }
    public static void segregateSol(int num[]){
        int start=0;
        int end=num.length-1;
        while (start<end) {
            if (num[start]==1 && num[end]==0) {
                int temp=num[start];
                num[start]=num[end];
                num[end]=temp;
            }
            start++;
            end--;
        }
        // System.out.println(start+end);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 1 };
        // outout will be 0 0 0 1 1 1
        // segregateProb(arr);
        segregateSol(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        // System.out.println(arr);
    }
}
