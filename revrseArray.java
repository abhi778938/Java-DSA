public class revrseArray {
public static void reverse(int num[]){
    int start=0,end=num.length-1;
    while (start<end) {
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;
        start++;
        end--;
    }
}
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
       reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
    
}