/*
 * Find the least number of stop for refill
 *
 * input:
 *  dist = the whole distance
 *  tank = fuel capacity
 *  stops[] = integer array which has the distance of each gas station
 *
 * *solution
 * we can user greedy algorithm(solve the problem for each step separately)
 * for each step, we need to check if this car can go to the next gas station/final destination with the fuel capacity
 * If it is possible, we also need to check the very far station which can go without refill.
 * Then, we can move the index number of stops array to the available very far position.
 *
 * Also, if it cannot reach to the next gas station/final destination we can stop the loop and return -1.
 *
 */


public class CarFuel {

    static int min_refills(int dist, int tank, int[] stops) {

        int num = 0;
        int lastStop = 0;
        int d = dist;
        int c = 0;

        boolean loop = true;

        while (loop) {

            if (d <= tank) {
                loop = false;
            } else if (d > tank) {

                if (c == stops.length) {
                    num = -1;
                    loop = false;
                }

                else if (stops[c] - lastStop <= tank) {
                    int i = 1;

                    while (c + i < stops.length && stops[c + i] - lastStop <= tank) {
                        i++;
                    }

                    if (c + i > stops.length) {
                        c = c + i;
                    } else {
                        d = d - (stops[c + i - 1] - lastStop);
                        lastStop = stops[c + i - 1];
                        c = c + i;
                        num++;
                    }

                }

                else if (stops[c] - lastStop > tank) {
                    num = -1;
                    loop = false;
                }

            }

        }

        return num;
    }
}