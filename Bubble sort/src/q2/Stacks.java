package q2;

public class Stacks {
    int maxSize, top;
    int[] numbers;

    Stacks(int size) {  //constructor
        maxSize = size;
        numbers = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top < maxSize - 1)
            numbers[++top] = value;
        else
            System.out.println("Stack is full");
    }

    int pop() {
        if (top >= 0)
            return numbers[top--];
        else
            return -1;

    }
}
