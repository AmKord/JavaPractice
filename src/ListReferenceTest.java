import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final List<String> arrayInt = new ArrayList<>();
		ListReferenceTest obj = new ListReferenceTest();
		arrayInt.add("One");
		obj.addData(arrayInt);
		System.out.println(arrayInt);
		
		
	}
	
	public List<String> addData(List<String> arrayPass) {
		
		arrayPass.add("Two");
		return arrayPass;
		
	}

}
