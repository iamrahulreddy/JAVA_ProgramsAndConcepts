package ObjectOrientedProgramming;

public class ClassesAndObjectsDemo {
    public static void main(String[] args) {
        //An object is called an instance of a class.
        //new keyword along with the constructor of the class are used to create an object.
        //Constructors are similar to methods and have the same name as the class.
        //we can access the members of the class using the object of the class followed by dot(.) operator.
        //objectName.someMethod();
        myProfile object = new myProfile();
        object.myFullName();
        System.out.println("I am "+object.age+" years old.");

    }
}

class myProfile {
    public int age = 21;
    void myFullName() {
        System.out.println("My full name is Muskula Rahul Reddy.");
    }
}
