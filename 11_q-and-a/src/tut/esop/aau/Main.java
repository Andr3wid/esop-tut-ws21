package tut.esop.aau;

public class Main {

    public static void main(String[] args) {
        Stack stack1 = new Stack();

        stack1.push("Hello");
        stack1.push("World");
        stack1.push(100);
        stack1.push(1.12f);

        float poppedObject = (float) stack1.pop();

        System.out.println("=== END ===");
    }
}
