package ObjectOrientedProgramming;

public class ClassAdditionalInfo {
        //Note that in the previous example, we have created objects inside another class and accessed the members from that class.
        //However, we can also create objects inside the same class.
        boolean currentlyStudying = true;
        void methodInfo() {
            System.out.println("objects can be instantiated in the same class.");
            System.out.println(":)");
        }
    public static void main(String[] args) {
        ClassAdditionalInfo object = new ClassAdditionalInfo();
        System.out.println();
        System.out.println(object.currentlyStudying);
        object.methodInfo();
    }
}
