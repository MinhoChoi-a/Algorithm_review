/*
 * Calculate the minimum operation number to get some number which is input value.
 * When we do calculate, there are only 3 options which are add 1, multiply by 2, and multiply by 3.
 * We also need to print out the sequence numbers.
 *
 * input:
 *  positive integer number
 *
 * *solution
 * To make correct answer, we have to trace every sequence of number.
 * We can use array to make this.
 * One array is going to store the minimum operation number for each series of number.
 * The other array is going to record the maximum number we can get at certain point, and the index number of the maximum number
 * will be the minimum operation number for that moment.
 * After that, we can do sublist from 0 index to the minimum operation number for the input value.
 *
 * If we start from the input value and keep decreasing the value with those calculation,
 * it seems faster way since we can keep minimize the number and decrease the number of comparison.
 * However, it could lead wrong result. To solve this problem, we should compare every case.
 *
 *
 */



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimitiveCalculator {

    static List<Integer> sequence(int m) {

        int[] minArray = new int[m+1];

        int x=0;
        minArray[0] = 0;

        minArray[1] = 0;

        List<Integer> sequence = new ArrayList<Integer>(Collections.nCopies(m, 1));

        for(int t=2; t<minArray.length; t++) {
            minArray[t] = m;
        }

        for(int i=2; i<=m; i++) {

            x=minArray[i-1] + 1;

            if(minArray[i] >= x) {
                minArray[i] = x;
                sequence.set(x,i);
            }

            if(i % 3 == 0) {
                x = minArray[i/3] + 1;
                if(minArray[i] >= x) {
                    minArray[i] = x;
                    sequence.set(x, i);
                }
            }

            if(i % 2 == 0) {
                x = minArray[i/2] + 1;
                if(minArray[i] >= x) {
                    minArray[i] = x;
                    sequence.set(x, i);
                }

            }}

        List<Integer> finalSequence = sequence.subList(0, minArray[m]+1);

        return finalSequence;
    }

}
