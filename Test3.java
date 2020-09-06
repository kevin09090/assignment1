

public class Test3 {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " Refsnes" + age);
    }
    public static void main(String[] args) {
        myMethod("As", 5);
        myMethod("sd", 1);
        myMethod("df", 9);
        // output = As Refsnes sd Refsnes df Refsnes

    }
}