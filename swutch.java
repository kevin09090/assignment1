public class switch {
    

}public static boid main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name");
    String answer = input.nextLine();

    switch(answer.toLowerCase()) {
    case "kevin":
         System.out.println("Your name is Kevin");
        break;
    case "john":
         System.out.prinln("Your name is hohn");
     default:
         System.out.println("your are not allowed here.");
    }
}
