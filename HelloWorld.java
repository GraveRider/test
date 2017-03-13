package firstlesson;

/**
 * @author zwaclaw
 *
 */
import java.time.localDate

public class HelloWorld {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate));

		String name = Input.input();

		System.out.println("HELLO UGLY WORLD!");
		System.out.println("The World is not ugly!");
		System.out.println("Hello " + name + "!");
	}
}
