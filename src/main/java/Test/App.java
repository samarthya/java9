package Test;


import org.samarthya.impl.TestOneImpl;
import org.samarthya.interfaces.InterfaceOne;
import org.samarthya.interfaces.InterfaceTwo;

/**
 * Hello world!
 */
public class App {
    /**
     * Example main application.
     *
     * @param args Arguments to the program.
     */
    public static void main(String[] args) {

        TestOneImpl tOne = new TestOneImpl();
        System.out.println(TestOneImpl.sayHello());
        System.out.println(InterfaceOne.sayHello());
        System.out.println(InterfaceTwo.sayHello());

        testOne();
        System.out.println(tOne.Salute());
        System.out.println(tOne.Salute("Bonjour "));
    }

    private static void testOne() {
        StringBuilder myStringIndex = new StringBuilder("ABCDEF123456");
        System.out.println(" String: " + myStringIndex.toString());
        System.out.println(" Length: " + myStringIndex.length());
        System.out.println(" Char [0]" + myStringIndex.toString().charAt(0));

        try {
            System.out.println(" Index : " + myStringIndex.substring(5, 1));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println(" Index exception should be thrown: " + ex.getMessage());
        }

        System.out.println(" " + myStringIndex.toString() + ".substring(5, 8) : " + myStringIndex.substring(5, 8));
    }
}
