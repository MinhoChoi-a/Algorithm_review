/*
* we need to make the pascal's triangle.
*
* In this question, we are going to have integer number.
* that integer number will be the number of rows.
* this rows started with the integer number 1
* and each level will have the n number of elements and that n means the level of each row
* In addition to that, each element in the row is the sum of the two number directly above it's level.

* input: integer number
* output: array of integer array which has elements for each level of rows.
*
* Solution
* the length of each level will be increased by 1
* and the first and last element of each rows should be 1
* that's because there is no other element we can add except the number 1.
*
* so we can make iteration for n-1 times. n is a input data.
* and we can do nested loop for n times for each the iteration.
* and by doing if statement
* if it is the first time or last time in the nested loop, we can just add number 1 to the integer array.
* Otherwise, we can get sum of ith element of the prior array and i+1th element of the prior array.
* this i is initialized as 0 and then keep incremented whenever we move to the next element.
*

 */


import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> element = new ArrayList<>();

        int last = 0;

        if (numRows > 0) {

            element.add(1);
            output.add(element);

            for(int i=1; i < numRows; i++) {

                last = i+1;
                element = new ArrayList<>();

                int check = 0;

                for(int l=0; l < last; l++) {

                    int ele = 1;

                    if(l==0) {
                        element.add(ele);
                    }


                    else if(l==last-1) {
                        element.add(ele);
                    }

                    else {
                        ele = output.get(i-1).get(check) + output.get(i-1).get(check+1);
                        element.add(ele);
                        check++;
                    }
                }

                output.add(element);
            }
        }

        return output;
    }
}
