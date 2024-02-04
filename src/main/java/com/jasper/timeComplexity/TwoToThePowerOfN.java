package timeComplexity;

/**
 * time complexity = exponential 细胞分裂
 *
 * f(n) = 2f(n-1) + 1
 *      = 2[2f(n-2) + 1] + 1
 *      = 2^2 f(n-2) + 2 + 1
 *      = 2^3 f(n-3) + 2^2 + 2 + 1
 *      = ...
 *      = 2^n f(0) + 2^(n-1) + 2^(n-2) + ... + 2 + 1
 */

public class TwoToThePowerOfN {
    public static void main(String[] args) {
        System.out.println(exponential(3));
        System.out.println(exponentialRecursive(3));
    }

    public  static int exponential(int n){
        int count = 0,base = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < base; j++) {
                count++;
            }
            base*=2;
        }
        return count;
    }

    /**
     * the time complexity of recursive most is 2^n
     * todo 归并和快排并不是
     * @param n n
     * @return result
     *
     */

    public static int exponentialRecursive(int n){
        if (n == 1)
            return 1;
        return exponentialRecursive(n-1)+exponentialRecursive(n-1)+1;
    }

    public static void bubbleSort(){

    }

//写冒泡排序


}
