import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] A = {1,-2,-3};

        Arrays.sort(A);

        boolean check = false;
        int index = 0;
        int result = 0;

        while(!check && index < A.length - 1) {

            if(A[index] >= 0) {

                if(A[index + 1] - A[index] > 1) {
                    check = true;
                    result = A[index] + 1;
                }
            }
            index++;
        }

        if(!check) {
            if(index == A.length-1) {
                System.out.println(A[A.length-1] + 1);
            }

            else {
                System.out.println(-1);
            }
        }

        else {
            System.out.println(result);
        }

    }

}
