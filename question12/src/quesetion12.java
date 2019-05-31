public class quesetion12 {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        if (s.length <= 1) return;
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
