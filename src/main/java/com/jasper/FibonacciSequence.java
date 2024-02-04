package com.jasper;

import java.util.HashMap;
import java.util.Locale;
import java.util.function.Function;

public class FibonacciSequence {
//    冗余计算
    private  static final HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(recursive(40));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

//    0 1 1 2 3 5 8
    public static int recursive(int n){
        /* 递归 */
            // 终止条件
            if (n ==0 || n==1)
                return n;
            else {
                if (cache.containsKey(n)){
                    return (int)cache.get(n);
                }
                int res = recursive(n-2)+recursive(n-1);
                cache.put(n,res);
                return res;
            }
    }
}
