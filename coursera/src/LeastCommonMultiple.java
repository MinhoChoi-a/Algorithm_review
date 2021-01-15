/*
 * Find the least common multiple between two integers.
 *
 * input: 2 numbers
 *
 * *solution
 * we can use the great common divider solution(Euclidean), then multiply with the common divider with each result of division.
 *
 */

public class LeastCommonMultiple {

    static int calc_lcm(int a, int b) {

        int gcd = 1;
        int numA; //bigger
        int numB; //smaller
        int d= 1;

        if(a>b) {
            numA = a;
            numB = b;
        }

        else {
            numA = b;
            numB = a;
        }

        while(!(d==0)) {
            d = numA%numB;
            numA = numB;
            numB = d;
        }

        gcd = numA;

        return gcd*(a/gcd)*(b/gcd);

    }

}
