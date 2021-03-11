import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
	
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		int[] arr = {-4, 3, -9, 0, 4, 1};
		
		int size = arr.length;
		int negativeCount =0;
		int positiveCount= 0;
		int zeroCount = 0;
		
		for (int i : arr) {
			if (i <0) {
				negativeCount ++;
			}
			else if (i>0) {
				positiveCount ++;
			}
			
			else if (i ==0) {
				zeroCount ++;
			}
		}
		//BigDecimal bd = new BigDecimal((double)positiveCount/size, MathContext.UNLIMITED);
		DecimalFormat df = new DecimalFormat("#.######");


		System.out.println(df.format((double)positiveCount/size));
		System.out.println(df.format((double)negativeCount/size));
		System.out.println(df.format((double)zeroCount/size));
		
		
	}

}
