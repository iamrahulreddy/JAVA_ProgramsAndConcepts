package Java_FlowControl;

public class JAVA_forLoop {
    public static void main(String[] args) {
        int sum = 0;
        int n = 50;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    //Java Infinite for Loop
    //If we set the test expression in such a way that it never evaluates to false, the for loop will run forever.
    //This is called infinite for loop.
    //The for loop executes the statements inside the body repeatedly until memory runs out.
    }
}
