import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        // Stack keeps element in first-in last-out format.
        Stack<String> animals = new Stack<>();
        // pushing elements into the stack
        animals.push("Tiger");
        animals.push("Orangutans");
        animals.push("Cow");
        animals.push("Dog");

        System.out.println("stack = " + animals);

        // looking which is the topmost element in stack using peek() method
        System.out.println("top most element in stack is : " + animals.peek());

        // pop() method removes the top most element in the stack
        animals.pop();
        System.out.println("stack = " + animals);
        System.out.println("top most element in stack after pop is : " + animals.peek());
    }
}
