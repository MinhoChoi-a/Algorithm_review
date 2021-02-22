/*
 * Find the the specific element and swap position to the end of the array
 * There might be multiple number of the element.
 *
 * input:
 *  integer array
 *
 * *solution
 * We can search the index of position which has the specific element, then swap it with the last position fo the array.
 * We are going to traverse the array from the index number 0 to the end of the array.
 * However, if we find the specific array and swap it, then we don't have to check the last position
 * since we already know that what it is.
 * Also, if there are multiple number of position which has the element, then we are going to swap it with the
 * decremented position number. To do that we can set one attribute which is incremented whenever we find the element.
 *
 */

public class Array_swap {

    static int[] swap(int array[], int e) {

        int d = 0;
        int temp = 0;

        for(int i=0; i < array.length-d; i++) {

            if(array[i] == e) {

                temp = array[i];
                array[i] = array[array.length-d];
                array[array.length-d] = temp;
                d++;
            }
        }

        return array;
    }
}
