import java.util.*;

public class string {
    public static void printString(String num){
        for(int i=0;i<num.length();i++){
            System.out.print(num.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         String str="abhishek";
       System.out.println(str.length());  // .length() is use in String with funtion type not like property on use in array
    String str1 ;
    Scanner sc = new Scanner(System.in);
    str1= sc.nextLine();
    printString(str1);
    // System.out.println(str1);
    // System.out.println(str1.length());

    }
}
