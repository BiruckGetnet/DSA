package q2;

public class Main {
    public static void main(String[] args) {
        Stacks numstack = new Stacks(3);
        numstack.push(11);
        numstack.push(22);
        numstack.push(33);
        numstack.pop();

        for(int i = 0; i < numstack.maxSize; i++) {
            System.out.println(numstack.numbers[i]);
        }

        //System.out.println(numstack.numbers[i]);
    }
}
