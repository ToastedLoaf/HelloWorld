// This file will print Hello World

public class HelloWorld {
	
	public static void main(String[] args) {
		// print hello world
		System.out.println("Hello world");
		
		// main menu
		public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter an original number");
        System.out.println("2 - Encrypt a number");
        System.out.println("3 - Decrypt a number");
        System.out.println("4 - Quit");

        selection = input.nextInt();
        return selection;    
    }
	public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter an original number");
        System.out.println("2 - Encrypt a number");
        System.out.println("3 - Decrypt a number");
        System.out.println("4 - Quit");

        selection = input.nextInt();
        return selection;    
    }
	
}