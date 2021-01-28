/*
 * Make better quick sort using 3 partition.
 *
 *
 * *solution
 * Quick sort is using one partition(pivot) value, and put it in the very first position of the array.
 * After that it compare with the value from the first. and keep swap the position depends on its circumstance.
 * To solve the issue that has same value on array, we can use 3 partition( <, =, >) when we compare and swap it.
 * The average operation time of this sorting takes nlogn since it will compare each n elements by dividing the array
 * for logn time.
 *
 */


import java.util.Random;

public class QuickSortThree {

    private static Random random = new Random();

    static void randomnizedQuickSort(int a[], int l, int r) {

        if(l >= r) {
            return;
        }

        int k= random.nextInt(r-l +1) +l;
        int temp = a[l];
        a[l] = a[k];
        a[k] = temp;

        int[] m = partition(a, l, r);
        randomnizedQuickSort(a, l, m[0]-1);
        randomnizedQuickSort(a, m[0]+1, r);

    }

    static int[] partition(int a[], int l, int r) {

        int m1= l;
        int m2= r;
        int i=l;
        int x=a[l];

        int[] m = {m1, m2};

        while(i <= m2) {

        if(a[i] < x) {

            int temp = a[m1];
            a[m1] = a[i];
            a[i] = temp;
            m1++;
            i++;
        }

        else if(a[i] == x) {
            i++;
        }

        else {
            int temp = a[m2];
            a[m2] = a[i];
            a[i] = temp;
            m2--;
        }
            m[0] = m1;
            m[1] = m2;
        }

        return m;
    }

}
