package firstlesson;

/**
 * @author zwaclaw
 *
 */
import java.time.localDate

public class HelloWorld {
	public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate));
=======
		String name = Input.input();

>>>>>>> testing
=======
		String name = Input.input();

>>>>>>> testing
		System.out.println("HELLO UGLY WORLD!");
		System.out.println("The World is not ugly!");
		System.out.println("Hello " + name + "!");
	}
}
