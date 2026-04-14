import java.util.Scanner;
import java.util.Stack;

public class Q3 {

    public static int evaluate(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            String s = arr[i];


            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (s.equals("+")) {
                    result = a + b;
                } else if (s.equals("-")) {
                    result = a - b;
                } else if (s.equals("*")) {
                    result = a * b;
                } else if (s.equals("/")) {
                    result = a / b;
                }

                stack.push(result);

            } else {

                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter postfix expression (space separated):");

        String line = sc.nextLine();

        String[] arr = line.split(" ");

        int result = evaluate(arr);

        System.out.println("Result: " + result);
    }
}
