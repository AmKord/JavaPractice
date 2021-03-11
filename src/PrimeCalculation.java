import java.util.ArrayList;
import java.util.List;

public class PrimeCalculation {

	public static void main(String[] args) {

		System.out.println("start");
		List<Spawn> spawn = new ArrayList<>();

		for (int i = 0; i < 100000; i++) {

			spawn.add(new Spawn());
		}

		System.out.println("done");

	}

}
