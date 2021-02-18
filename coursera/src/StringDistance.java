/*
 * Calculate the minimum number of operations to transform one string into another.
 *
 * input:
 *  2 String values
 *
 * *solution
 * We have to compare each character and accumulate the count number whenever there is a difference.
 * We also have to consider the minimum number of operation, that means we have to compare each side
 * to get smaller number.
 * To that we can use 2 dimensional array, and check every case to compare all of characters.
 * All in all, we will get the last element as the minimum operation count number.
 *
 */

public class StringDistance {

    static int EditDistance(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();

        int x=0;

        int[][] dimArray = new int[sLength+1][tLength+1];

        dimArray[0][0] = 0;

        for(int i=1; i<=sLength; i++) {
            dimArray[i][0] = i;
        }

        for(int i=1; i<=tLength; i++) {
            dimArray[0][i] = i;
        }

        for(int i=1; i<=tLength; i++) {

            for(int n=1; n<=sLength; n++) {

                if(s.charAt(n-1) == t.charAt(i-1)) {
                    x = dimArray[n-1][i-1];
                    dimArray[n][i] = x;
                }

                else {
                    x = dimArray[n-1][i-1]+1;
                    dimArray[n][i] = x;

                    if(dimArray[n][i] > dimArray[n-1][i]) {
                        x = dimArray[n-1][i] + 1;
                        dimArray[n][i] = x;
                    }

                    if(dimArray[n][i] > dimArray[n][i-1]) {
                        x = dimArray[n][i-1]+1;
                        dimArray[n][i] = x;
                    }
                }
            }
        }
        return dimArray[sLength][tLength];
    }
}
