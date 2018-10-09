// This file will print Hello World
import java.util.*
public class HelloWorld {
	
	public static void main(String[] args) {
		// print hello world
		System.out.println("Hello world");
	}
		
		// main menu
		public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter an original number");
        System.out.println("2 - Say my name, say my name!");
        System.out.println("3 - Quit");
				
				outer:
        selection = input.nextInt();
        if (selection == 1) {
				 selection = input.nextInt();
				         System.out.println($input + " is such a cool number!");
					return outer;
				} 
				if (selection == 2) {
				        System.out.println("lol no");
								return outer;

				}
				if (selection == 3) {
				return;
				}
    }
	
	

	