import java.util.Scanner;

public class StrudyException {

	public static void main(String[] args) {
		try {
		Errorr e = new Errorr();
		e.eo();
		}catch(Exception s) {
			System.out.println(s.getMessage());
		}
}
}
