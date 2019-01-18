import java.util.ArrayList;

public class EvenFibonacciNumbers {

    static int num = 1, num1 = 2, num2;


    public static void main(String[] args) {

       System.out.println(addEvenNumbers(100));
    }


    /**
     *
     * @param max ; the maximum limit
     * @return sum of even numbers in the arrayList
     */
    public static int addEvenNumbers( int max) {

        int previous = 1, current = 2, next = 0,   sum = 0;//init fibo series 1, 2 ...

        //check if the current fib number has reached maximum value
        while (current < max ){
            if (current % 2 == 0 ){
                sum += current;
            }
            next = previous + current;
            previous = current;
            current = next;
        }


        return sum;

    }
}
