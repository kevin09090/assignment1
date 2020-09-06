public class password {
    //method is one of members of class
        public static void main(String[] args) {
    //Initialization and Definition
            String password = “difficultpassword”;
            String guess;
    //Scanner is a class name James Gosling defined already
            Scanner input = new Scanner(System.in);
    //Do while needs ; at the end
            do {
                System.out.println(“Guess the password”);
                guess = input.nextLine();
                if (password.equals(guess)) {
                    System.out.println(“Your password is right and you are in”);
                } else {
                    System.out.println(“Your password is wrong”);
                }
            } while (!password.equals(guess));
            input.close();
        }
}