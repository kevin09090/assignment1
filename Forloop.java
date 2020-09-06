public class Forloop {

    public static void main(String[] args) {
        for ( int r = 9; r>= 0; r--) {
            for ( int c =9; c>=0; c--) {
                if ( c== r)
                    break;
                System.out.print(c);
            }
            System.out.println(); 
        }
    }
    
}
