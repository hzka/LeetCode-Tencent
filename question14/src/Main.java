public class Main {

    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int []{1,2,3,4}));
    }

    public static int[] productExceptSelf(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        int tmp = 1;
        for (int j = A.length - 2; j >= 0; j--) {
            tmp *= A[j+1];
            B[j] *= tmp;
        }
        return B;
    }

}
