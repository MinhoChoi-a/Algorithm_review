/*
 * Find the great common divider between two integers.
 * Using Euclidean algorithm.
 *
 * input: 2 numbers
 *
 * *solution
 * we can keep divide the bigger number with the smaller number, until the smaller number can divide the bigger number without the rest.
 * When we repeatedly divide each number, we are going to use the rest number and switch it as a smaller number,
 * and the bigger number set with the prior smaller number.
 * That's because, we just need to check if the smaller number can divide the bigger number perfectly.
 * Therefore, we can keep focusing on rest number which is not divided from the prior step
 *
 */

public class GreatCommonDivider {

    static int calc_gcd(int a, int b) {

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

        return gcd;
    }
}
