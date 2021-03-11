
public class TimeConversion15 {
	
	public static void main(String[] args) {
		
		
		String time = "01:05:45PM";
		//String[] split = time.split("(([0-9]){2}:){2}([0-9]){2}([A-Z]){2}");
		
		int hh = Integer.parseInt(time.substring(0, 2));
		
		if(time.contains("PM")) {
			
			if(hh != 12) {
				hh += 12;
				time = time.replace(time.substring(0, 2), Integer.toString(hh));
			}
			
			time = time.replace("PM", " ");
		}
		else {
			if(hh == 12) {
				time = time.replace(time.substring(0, 2), "00") ;
			}
			time = time.replace("AM", " ");
		}
		System.out.println(time);	
//		for (String str : split) {
//			System.out.println(str);
//		}
	}

}
