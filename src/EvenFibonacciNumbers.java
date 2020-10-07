import java.util.ArrayList;

public class EvenFibonacciNumbers {

    //Fibonacci series starts with 0 
    static int num = 0, num1 = 1, num2;


    public static void main(String[] args) {

       System.out.println(addEvenNumbers(100));
    }


    /**
     *
     * @param max ; the maximum limit
     * @return sum of even numbers in the arrayList
     */
    public static int addEvenNumbers( int max) {

        int previous = 0, current = 1, next = 0,   sum = 0;//init fibo series 0, 1 ...

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
