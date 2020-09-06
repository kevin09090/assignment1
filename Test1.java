public class Test1 {
    static void mtMethod() {
        System.out.println("I just got exected");
    }
    public static void main(String[] args) {
        mtMethod();
        mtMethod();
        mtMethod();
        // output = I just got exected * 3

    }
}
