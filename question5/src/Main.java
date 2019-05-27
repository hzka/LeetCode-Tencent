public class Main {

    public static void main(String[] args) {
        String[] strings = new String[]{"he", "he",""};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) { //以第一个字符串为初始最长公共字符串
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) { //遍历每一个字符串
                //如果当前字符的索引超出了当前字符串的长度，或者不为c,
                //那么返回索引为（0，n-1）的前缀
                if (i == strs[j].length() ||
                        strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
//    public static String longestCommonPrefix(String[] strs) {
//        StringBuilder sb = new StringBuilder();
//        if (strs.length == 0) return sb.toString();
//        if (strs.length == 1) return strs[0];
//        int j = 0;
//        boolean flag = false;
//        while (j < Integer.MAX_VALUE) {
//            for (int i = 0; i < strs.length - 1; i++) {
//                if (strs[i].trim().equals("")) return sb.toString();
//                if (j >= strs[i].length() || j >= strs[i + 1].length()) {
//                    flag = true;
//                    break;
//                }
//                if(strs[i].charAt(j) != strs[i + 1].charAt(j)){
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) break;
//            sb.append(strs[0].charAt(j));
//            j++;
//        }
//        return sb.toString();
//    }

