/*
* Find the maximum product of two distinct numbers in a sequence of non-negative integers.
*
* input: numbers = non-negative integers
*
* *solution
* At first, we can search the biggest number from the list,
* then store the value and index number.
* After that, we can re-search the list to find the second biggest number.
* To do that, we can use 'if statement' and stored index number.*
*
*/

class MaximumPairWise {

    static long getMaxPairWiseProductFast(int[] numbers) {

        long max_product = 0;
        int n = numbers.length;
        int maxOne = 0;
        int maxTwo = 0;
        int maxIndex = 0;

        for(int first = 0; first < n; first++) {

            int a = numbers[first];

            if(maxOne < a) {
                maxOne = a;
                maxIndex = first;
            }
        }

        for(int first = 0; first < n; first++) {

            int b = numbers[first];

            if(maxTwo < b && maxIndex != first)
            {
                maxTwo = b;
            }
        }

        max_product = (long)maxOne * (long)maxTwo;

        return max_product;

    }

}