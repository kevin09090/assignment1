
public class Test2 {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }
    public static void main(String[] args) {
        myMethod("As");
        myMethod("sd");
        myMethod("df");
        // output = As Refsnes sd Refsnes df Refsnes

    }
}