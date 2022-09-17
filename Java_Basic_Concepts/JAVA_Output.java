package Java_Basic_Concepts;

public class JAVA_Output {
    public static void main(String[] args) {
        //Java Output
        //In Java, we can simply use
        //System.out.println(); or
        //System.out.print(); or
        //System.out.printf();
        //To send output to standard output (screen).
        //Here, System is a class
        //out is a public static field: it accepts output data.

        //Difference between println(), print() and printf()
        //print() - It prints string inside the quotes.
        //println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
        //printf() - It provides string formatting (similar to printf in C/C++ programming).
        int x=100;
        System.out.printf("Formatted output %d\n",x);
        System.out.println();

        //To print integers,float,char use directly numbers,character
        //To display integers variables we don't use quotation marks
        System.out.println(100);
        System.out.println(50.2);
        System.out.println('A');
        System.out.println();


    }
}
