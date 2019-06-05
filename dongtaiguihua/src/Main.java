public class Main {

    public static void main(String[] args) {
        int[] p = new int[]{1, 5, 8, 9, 10, 17};
        System.out.println(buttom_up_cut(p));
    }
//    public static int cut(int []p,int n)
//    {
//        if(n==0)
//            return 0;
//        int q=Integer.MIN_VALUE;
//        for(int i=1;i<=n;i++)
//        {
//            q=Math.max(q, p[i-1]+cut(p, n-i));
//        }
//        return q;
//    }

    public static int buttom_up_cut(int[] p) {
        int[] r = new int[p.length + 1];//用于存放最优解。
        // 动态规划满足的两个条件：
//        ①最优子结构
//        用动态规划求解最优化问题的第一步就是刻画最优解的结构，如果一个问题
//        的解结构包含其子问题的最优解，就称此问题具有最优子结构性质。因此，
//        某个问题是否适合应用动态规划算法，它是否具有最优子结构性质是一个很好的线索。
//        使用动态规划算法时，用子问题的最优解来构造原问题的最优解。因此必须考查最优解
//         中用到的所有子问题。
//         ②重叠子问题
//        在斐波拉契数列和钢条切割结构图中，可以看到大量的重叠子问题，比如说在求fib（6）的时候，
//        fib（2）被调用了5次，在求cut（4）的时候cut（0）被调用了4次。
//        如果使用递归算法的时候会反复的求解相同的子问题，不停的调用函数，而不是生成新的子问题。
//        如果递归算法反复求解相同的子问题，就称为具有重叠子问题性质。
//        在动态规划算法中使用数组来保存子问题的解，
//        这样子问题多次求解的时候可以直接查表不用调用函数递归。

        for (int i = 1; i <= p.length; i++) {
            int q = -1;
            //①
            for (int j = 1; j <= i; j++)
                q = Math.max(q, p[j - 1] + r[i - j]);
            r[i] = q;
        }
        return r[p.length];
    }

}
