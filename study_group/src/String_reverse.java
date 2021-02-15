/*
-BEST SOLUTION-

From the input, we can get length of the element by converting to String value.
then we can use that length info to get the position of each number

ex. 1234 input

i = position started with 0

and we can convert the number to this format
4 * 10^i + 3*10^(i+1) +

keep increase the exponent number until the length of the input

a = x % 10^n (n started with 1)
b += a * 10^(length-1)

*/

public class String_reverse {

    static int reverseNumber(int x) {

        //int x = -2147483648;

        int check = 1;

        if(x < 0) {
            check = check * -1;
            x = x * -1;
        }

        String ps = String.valueOf(x);

        int length = ps.length();

        String[] c = new String[length];

        for(int i=0; i<length; i++) {

            String a = ps.substring(i, i+1);
            c[length-1-i] = a;

        }

        String result = "";

        for(int f=0; f<length; f++) {

            result += c[f];

        }

        Long fin = Long.parseLong(result);

        fin = fin * check;

        if(fin < Math.pow(-2,31) || fin > Math.pow(2,31)-1) {
            return 0;
        }

        return fin.intValue();

    }

}
