import java.util.*;


 public int linearSearch(String name[],String item){
    for(int i=0;i<name.length;i++){
        if(name[i].equals(item)){
            return i;
        }
    }
    return -1;
 }
 public static void main(String[]args){
    String menu[]={"pizza","burger","samosha","aloo tikki"};
    String item="samosha";
    int result=linearSearch(menu, item);
    System.out.println("Index of " + item + " is: " + result);
 }
 