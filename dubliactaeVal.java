import java.util.Arrays;
import java.util.HashMap;

public class dubliactaeVal {
    public static boolean dublival(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
        // time complecity is o(n^2)  and space complecity is o(1)
    }
    public static boolean dubliVal2(int num[]){
        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++){
            if(num[i]==num[i+1]){
                return true;
            }
        }
        return false;
        // time complecity is o(nlog(n))  and space complecity is o(1)
    }
    public static void main(String[] args) {
        int number[]={1,2,3,1};// complecity of short nlog(n) and space complecity in o(1)
        // System.out.println(dublival(number))
        System.out.println(dubliVal2(number));
        System.out.println(usinghashMap(number));
    }
        


    public static boolean usinghashMap(int nums[]){
        int n=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])>1){
                return true;
            }
        }
return false;
    }
}
