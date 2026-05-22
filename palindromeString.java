public class palindromeString {
    public static boolean palindrome(String s){
    int n=s.length()-1;
    for(int i=0;i<s.length()/2;i++){
        if(s.charAt(i)!=s.charAt(n-i)){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        String s="racar";
     System.out.println(palindrome(s));
    }
}
