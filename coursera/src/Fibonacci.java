/*
 * Find the nth Fibonacci number
 * Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
 *
 * input: number = nth position number
 *
 * *solution
 * If we use a recursive call, then it will take exponential time to get result.
 * However, we can make it simple by using list. It take O(N) time.
 *
 *
 */

public class Fibonacci {

    static long calc_fib(int n) {

        if(n <=1)
            return n;

        long[] list = new long[n];

        list[0] = 1;
        list[1] = 1;

        for(int i=2; i<n; i++) {
            list[i] = list[i-1] + list[i-2];
        }

        return (long)list[n-1];
    }
}
