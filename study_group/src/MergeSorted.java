/*
Give 2 sorted arrays, we need to merge it to the first array, and sort it.
the size of the first array is the sum of the number of initialized elements in each array.
every initialized elements are sorted in ascending order.

input: 2 sorted integer array. one of array can be a null data.
integer m and n which indicate the number sorted elements in each array.

*Solution:
We can use the space of the uninitialized portion in the first array.
we can check the biggest element by comparing 2 arrays.
then whenever we found the bigger one we can place it to the end of the first array.

 */

public class MergeSorted {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;

        for(int i= m+n-1; i >=0; i--) {

         if(p2 <0)  return;

         if(p1 >= 0 && nums1[p1] > nums2[p2]) {
             nums1[i] = nums1[p1];
             p1--;
         }

         else {
             nums1[i] = nums2[p2];
             p2--;
         }

        }

    }


}
