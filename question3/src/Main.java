public class Main {

    public static void main(String[] args) {
        String s = " helllett";
        System.out.println(longestPalindrome(s));


    }
    public static String longestPalindrome(String s) {
        //1.假设字符串为空，返回空字符串即可。
        if (s == null || s.length() == 0) {
            return "";
        }
        //2.使用数组记录回文子串开始和结束的位置，最小和最大，并将字符串转为字符数组。
        int[] range = new int[2];
        char[] c = s.toCharArray();
        //3.遍历字符串
        for (int i = 0; i < s.length(); i++) {
            i = find(c, i, range);//
        }
        //4.截取字符串
        return s.substring(range[0], range[1] + 1);
    }

    private static int find(char[] c, int low, int[] range) {
        int max = c.length - 1;
        int high = low;
        //3.1设置两个指向开始位置的指针，
        // 假设当前位置的下一个字符等于当前位置的字符，则将high++.
        while (high < max && c[high + 1] == c[low]) {
            high++;
        }
        int result = high;
        //3.2以当前字符串为中心，若指针不越界&&高位低位字符相等，进行两边扩展。
        while (low > 0 && high < max && c[low - 1] == c[high + 1]) {
            low--;
            high++;
        }
        //3.3若两指针之间长度大于之前的长度，进行update。
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return result;
    }
//    public static String longestPalindrome(String s) {
//        int len = s.length();
//        int maxLen = 0;
//        String res = null;
//
//        boolean[][] dp = new boolean[len][len];
//        for (int i = len - 1; i >= 0; i--) {
//            for (int j = i; j < len; j++) {
//                dp[i][j] = (s.charAt(i) == s.charAt(j) &&
//                        (j - i < 3 || dp[i + 1][j - 1] == true));
//                //1.当前遍历到的字符i~j是否是回文子串取决于i+1~j-1，也就是i~j中间是否回文
//                //并且s[i]是否等于s[j]。
//
//                //2.dp[i][j]是true意味着i~j是回文子串，则在下面对res进行更新，若为false，
//                //则该子串不是回文子串，开始遍历下一个子串
//                if(dp[i][j]==true && (res==null || j-i+1>maxLen)){
//                    //如果该子串长度更长，则更新res
//                    res= s.substring(i,j+1);
//                    maxLen = res.length();
//                }
//            }
//        }
//        return res;
//    }
//    public static String longestPalindrome(String s) {
//
//        int MIN = Integer.MIN_VALUE;
//        if(s.length() <= 1)  return s;
//        String s1 = new String();
//        for (int i = 0; i < s.length() - 1; i++) {
//            for (int j = s.length(); j >= i+1 ; j--) {
//                if (s.substring(i, j).equals(new StringBuilder(s.substring(i, j)).reverse().toString())
//                        && s.substring(i, j).length() > MIN) {
//                    MIN = s.substring(i, j).length();
//                    s1 = s.substring(i, j);
//                }
//            }
//        }
//        return s1;
//    }
}
