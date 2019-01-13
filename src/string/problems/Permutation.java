package string.problems;


public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "ABCD");
    }
    public static void permutation(String prefix, String sg){
        int n = sg.length();

        if(n==0){
            System.out.println(prefix);
        }else{
            for(int i=0; i < n; i++){
                permutation(prefix + sg.charAt(i), sg.substring(0, i) + sg.substring(i+1,n));
            }
        }
    }
}