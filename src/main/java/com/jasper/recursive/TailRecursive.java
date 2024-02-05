package recursive;

public class TailRecursive {
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    int factorialTail(int n, int result) {
        if (n == 0 || n == 1) {
            return result;
        } else {
            return factorialTail(n - 1, n * result);
        }
    }

}
