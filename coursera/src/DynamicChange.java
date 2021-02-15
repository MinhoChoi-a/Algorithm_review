/*
 * Find the the minimum number of denomination.
 * We used the greedy algorithm before, but it has a limit that cannot get the minimum number in some case.
 *
 * input:
 *  some integer number
 *
 * *solution
 * the input number is an integer number. That means we can trace the way to make some number from 1 to that input number.
 * We have 3 type of change for this problem. So we can compare every 3 cases for each number.
 * To make certain number, if we can use the bigger number, then that is the more efficient to make minimum denomination.
 * So we can store the count number what we need to add some number to make that certain element in that position.
 * All in all, we will get to the last number which is the input, then the count number for that moment will be the answer.
 *
 */


public class DynamicChange {

    static int getChange(int m) {

        int[] changeArray = {1,3,4};
        int[] minArray = new int[m+1];
        int x = 0;
        minArray[0] = 0;
        minArray[1] = 1;

        for(int t = 2; t < minArray.length; t++) {
            minArray[t] = m;
        }

        for(int i =1; i <=m ; i++) {

            for(int n=0; n < changeArray.length; n++) {

                if(changeArray[n] <= i) {

                    x = minArray[i-changeArray[n]] + 1;
                    if(minArray[i] >= x) {
                        minArray[i] = x;
                    }
                }
            }
        }

        return minArray[m];
    }

}
