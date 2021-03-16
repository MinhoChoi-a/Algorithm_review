public class numOfOne {

    public static void main(String args[]) {

        long num = 4294967293L;
        long check = 0;
        int count = 0;

        while(num > 1) {

            check = num % 2;

            if(check == 1) {
                count++;
            }
                num = num/2;
        }

        if(num == 1) count++;

        System.out.println(count);
    }

}
