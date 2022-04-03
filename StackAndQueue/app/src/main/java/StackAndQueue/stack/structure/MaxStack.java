package StackAndQueue.stack.structure;

public class MaxStack {

    Stack<Integer> stackOutput = new Stack();
    int maxNode;

    public void pushMax(int value) {
        if (stackOutput.isEmpty()) {
            maxNode = value;
            stackOutput.push(value);
            System.out.println("Node Inserted is : " + value);
        } else {
            if (value > maxNode) {
                stackOutput.push(2 * value - maxNode);
                maxNode = value;
            } else stackOutput.push(value);

            System.out.println("Node Inserted is : " + value);
        }
    }

    public void peekTopMaxStack() {
        if (stackOutput.isEmpty()) {
            System.out.print("Stack is empty ");

        } else {
            int tempValue = stackOutput.peek();

            if (tempValue > maxNode) {
                System.out.println("Top Node In StackMax value is: " + maxNode);
            } else {
                System.out.println("Top Node In StackMax value is: " + tempValue);
            }
        }
    }

    public void popMax() {
        if (stackOutput.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            int tempValue = stackOutput.peek();
            stackOutput.pop();

            if (tempValue > maxNode) {

                maxNode = 2 * maxNode - tempValue;
            }
        }
    }

    public int getMax() {
        if (stackOutput.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("the Max node in stack is: " + maxNode);

        }
        return maxNode;
    }

    public static boolean validateParentheses(String text) {

        Stack stack = new Stack();
        for (char symbol : text.toCharArray()) {
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            } else {
                if (!stack.isEmpty()) {
                    char top = (Character) stack.peek();
                    if (symbol == ')' && top == '(' || symbol == '}' && top == '{' || symbol == ']' && top == '[') {
                        stack.pop();
                    }
                } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

}






