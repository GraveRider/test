import java.util.Scanner;

class Input {
	private Scanner reader = new Scanner(System.in);
	
	public static String Input() {
	System.out.println("Enter something: ");
	String text = reader.nextLine();
	return text;
}
}
