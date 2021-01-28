/*
 * Check if the array has a majority number or not.
 *
 * input:
 *  the length of the array
 *  non negative integers
 *   *
 * *solution
 * Naive solution is that traverse all items in array with the iteration to calculate the total number of the same value.
 * It will take n^2.
 * However, if we can go through the array just one time and get the candidate for majority. We can check the total number of
 * the same value with that specific candidate. After that, we can just compare the total number if it is bigger than the 2 over the size of array.
 *
 * To find the majority candidate, we are going to have count variable, and increment it if it has a same with the next element.
 * If it is not, then we are going to decrement it, then if it become 0, we are going to change the candidate with the next element.
 *
 */


public class MajorityCheck {

    static int getMajorityElement(int[] a, int left, int right) {

        int candidate = findCandidate(a, right);

        if(isMajority(a, right, candidate))
            return 1;

        else
            return -1;

    }

    static int findCandidate(int a[], int size) {

        int maj_index=0, count=1;

        for(int i=1; i < size; i++) {

            if(a[maj_index] == a[i])
                count++;

            else
                count--;

            if(count == 0) {

                maj_index = i;
                count = 1;
            }
        }

        return a[maj_index];
    }

    static boolean isMajority(int a[], int size, int cand) {

        int count = 0;

        for(int i=0; i < size; i++) {

            if(a[i] == cand) {
                count++;
            }
        }

        if(count > size/2)
            return true;

        return false;
    }

}
