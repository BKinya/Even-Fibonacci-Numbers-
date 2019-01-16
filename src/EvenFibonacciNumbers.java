import java.util.ArrayList;

public class EvenFibonacciNumbers {

    static int num = 1, num1 = 2, num2;
    static ArrayList<Integer> numFiboSeries = new ArrayList<>();

    public static void main(String[] args) {

        /**
         * add the first two digits of the fibonacci series to the arrayList
         */
        numFiboSeries.add(num);
        numFiboSeries.add(num1);

        //an arrayList of values of fibonacci seriies less than [100]
        ArrayList<Integer> fiboSeriesNumbers = fibonacciSeries(100);
        //sum of even numbers in the arrayList
        int finalSum = addEvenNumbers(fiboSeriesNumbers);

        System.out.println(finalSum);

    }

    /**
     *
     * @param max ; the maximum value wich the fibonacci sequence values should not exceed
     * @return an arrayList of the values in the fibonacci series
     */

    public static ArrayList<Integer> fibonacciSeries(int max) {
        num2 = num + num1;

        if (num2 < max) {
            num = num1;
            num1 = num2;
            numFiboSeries.add(num2);

           return fibonacciSeries(max);
        }
        return numFiboSeries;

    }

    /**
     *
     * @param numbers ; an arraylist of numbers
     * @return sum of even numbers in the arrayList
     */
    public static int addEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);

            }
        }
        return sum;

    }
}
