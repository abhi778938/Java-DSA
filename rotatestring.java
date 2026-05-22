import java.util.*;

public class rotatestring {

    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1; i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0) {
                 largest=fruits[i];
            }
        }
        // System.out.println(largest);


        StringBuilder sb=new StringBuilder("");

        for(char i='a';i<='z';i++ ) {
            sb.append(i);
        }
        System.out.println(sb +  " ");
    }
}
