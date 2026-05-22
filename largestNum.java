import java.util.*;
public class largestNum {
    public static int largestNumb(int num[]){
        int largest=Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        for(int i=0; i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("smallest number is "+smallest);
        return largest;
    }
    
    public static void main(String[] args) {
        int number[] ={1,2,3,5,4};
System.out.println("The largets number of this array is is "+largestNumb(number));
    }

}
