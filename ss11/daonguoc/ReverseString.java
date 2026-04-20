import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello world";

        Stack<String> stack = new Stack<>();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }

        String result = "";

        while (!stack.isEmpty()) {
            result += stack.pop() + " ";
        }

        System.out.println(result);
    }
}