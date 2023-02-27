package src;

public class test5 {
    public static void main(String[] args) {
        String str = "qweeukfgeeeet";
        char[] arr  = new char[str.length()];
        int k = str.length();
        for (int i = 0; i <= k; i++){
            char result1 = str.charAt(i);
            char result2 = str.charAt(i+1);
            if (result1 != result2){
                System.out.print(result1);
                i++;
                System.out.print(result2);
            }
            else {
                System.out.println(result2);
            }
        }
    }
}
