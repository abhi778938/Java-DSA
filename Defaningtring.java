public class Defaningtring {

    public static String defaString(String address) {

        int index = 0;
        String ans = "";

        while (index < address.length()) {

            if (address.charAt(index) == '.') {
                ans += "[.]";
            } else {
                ans += address.charAt(index);
            }

            index++;
        }

        return ans;
    }

    public static void main(String[] args) {

        String address = "121.234.45.49";

        System.out.println(defaString(address));
    }
}