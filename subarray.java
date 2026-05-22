import java.util.*;


// public class subarray {
//     public static void subArr(int num[]){


//         int current=0;
//         int maxsum=Integer.MIN_VALUE;
//         for (int i=0; i<num.length;i++){
//             int start=i;
//             current=0;
//             for(int j=i+1;j<num.length;j++){
//                 int end =j;
//                 for(int k=start;k<=end;k++){
//                     current+=num[k];
//                 }
//                 if(current>maxsum){
//                     maxsum=current;
//                 }
//                 System.out.println(current);
//             }
            
//         }
//         System.out.println(" the maximum sum of subarrays is " +maxsum);
//     }
//     public static void main(String[] args) {
//         int number[]={2,4,6,8,10};
//         subArr(number);
//     }
// }


// brute force approach is o(n^3) to o(n1) approch
 
public class subarray {

    public static void subArr(int num[]){
  int current =0;
  int maxsum=Integer.MIN_VALUE;
   for(int i=0; i<num.length;i++){
    current=0;
    for(int j=i;j<num.length;j++){
        current=current+num[j];
    }
    if(current>maxsum){
        maxsum=current;
    }
    System.out.println(current);
   }
    System.out.println("The maximum sum of subarrays is: " + maxsum);
     }

     public static void cadanse(int num[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
      cs +=num[i];
      if(cs<0){
        cs=0;

      }
      ms=Math.max(ms, cs);
        }
        System.out.println("The maximum sum of subarrays is: " + ms);
     }
     public static void main(String[] args) {
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        cadanse(number);
     }
}