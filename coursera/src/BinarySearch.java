/*
 * Find the the index number of matching value in the 2nd Integer array using binary search.
 * If the 2nd array doesn't have matching value, return -1.
 *
 * input:
 *  1st line: the length of array and distinct integer value in increasing order
 *  2nd line: the kth length of array and k number of positive integer
 *
 * *solution
 * To search the matching value, we can keep getting the middle point of the array and check if it is equal, bigger or smaller than the value.
 * if is equal, then we can just return that position.
 * if it is smaller, than we can move the middle point the left half of the array. Also we need to move the last position of the search area to the middle point - 1.
 * if it is bigger, than we can invert this action.
 * And we need to keep doing this action recursively, until we find the matching data, or we reached to the last position.
 *
 */

public class BinarySearch {

    static int binarySearch(int a[], int b) {

        int r = a.length - 1;
        int l = 0;
        int m = 0;
        int p = -1;

        boolean loop = true;

        while(loop && l <=r ) {

            m = l + (r-l)/2;

            if(b == a[m]) {

                loop = false;
                p = m;
            }

            else if(b < a[m]) {
                r = m - 1;
            }

            else if(b > a[m]) {
                l = m + 1;
            }

        }

        return p;



    }

}
