public class Main {

    public static void main(String[] args) {
        int []p = new int[] {1,5,8,10,17,17,20,24,30};
        String s ="   sadjaskdj  k ";
        System.out.println(s.trim());


    }

//    public static String longestPalindrome(String s) {
//
//    }
    public static String longestPalindrome(String s) {

        int MIN = Integer.MIN_VALUE;
        if(s.length() <= 1)  return s;
        String s1 = new String();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length(); j >= i+1 ; j--) {
                if (s.substring(i, j).equals(new StringBuilder(s.substring(i, j)).reverse().toString())
                        && s.substring(i, j).length() > MIN) {
                    MIN = s.substring(i, j).length();
                    s1 = s.substring(i, j);
                }
            }
        }
        return s1;
    }
}
