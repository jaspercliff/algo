package timeComplexity;

/**
 * 每轮缩减到一半  log2N
 */
public class LogN {
    public static void main(String[] args) {
        System.out.println("logArithmetic(5) = " + logArithmetic(5));
        System.out.println("logRecursive(5) = " + logRecursive(5));
        System.out.println("linearLogRecur(5) = " + linearLogRecur(4));
    }

    public static int logArithmetic(int n) {
        int count = 0;
        while (n > 1) {
            n /= 2;
            count++;
        }
        return count;
    }

    /*对数阶*/
    public static int logRecursive(int n) {
        if (n <= 1) {
            return 0;
        }
        return logRecursive(n / 2) + 1;
    }

    /* 线性对数阶
    * 快速排序 堆排序 归并排序
    *  */
    static int linearLogRecur(float n) {
        if (n <= 1)
            return 1;
        int count = linearLogRecur(n / 2) + linearLogRecur(n / 2);
        for (int i = 0; i < n; i++) {
            count++;
        }
        return count;
    }
}
