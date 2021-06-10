// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//maximum possible value
//need to check every position to know if that integer is smaller than 5
//need to check if the N is negative/0 or not
//if 0 => N + 5*10
//if - => N - 5*10^length

//integer => need to know length of it

//check each number by using modulus
//then we can get the hexadecimal point <= n + 1
//until we get the point we need to keep increasing the value
//otherwise we can start by the number which is mutilplied by 10

class Solution_EPAM_0609 {
    public int solution(int N) {

        //return data
        int result=0;

        //inserting number
        int insertNum=5;

        //length of N
        int length= String.valueOf(N).length();

        if(N == 0) {
            result = insertNum*10;
            return result;
        }

        if(N < 0) {
            result = N + (-5*(int) Math.pow(10,(length-1)));
            return result;
        }

        boolean check = false;
        int i=0;
        int checkValue = N;

        while(!check && i<length) {

            int hex = (int) Math.pow(10,(length-i));
            int hexForCheck = hex/10;

            int checkNum = checkValue / hexForCheck;

            checkValue = checkValue % hexForCheck;

            if(checkNum < 5) {
                result = result + 5*hex;
                check = true;
            }

            else {
                result = result + checkNum*hex;
            }

            i++;
        }

        //in case of some number is smaller than 5
        if(check) {
            return result + N% (int) Math.pow(10,(length-i+1));
        }

        //in case of every number is bigger than 5
        return result + 5;
    }
}
