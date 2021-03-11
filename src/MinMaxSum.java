
public class MinMaxSum {
	
	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 3, 4, 5};
		long min = 1000000000;
		long max = 1;
		
//		for (int i=0; i<arr.length; i++) {
//			int addition =0;
//			for(int j=0; j <arr.length; j++) {
//				if(j!=i) {
//					addition += arr[j];
//				}
//			}
//			if(addition > max) {
//				max = addition;
//			}
//			if(addition < min){
//				min = addition;
//			}
//			
//			
//		}
		System.out.println(min +" "+ max);
		int sum =0;
		int addition =arr[0];
		for (int i=0; i<arr.length;i++) {
			sum += arr[i];
			if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            
		}
		
//		for (int j=0; j<arr.length;j++) {
//			addition = sum - arr[j];
//			if(addition > max) {
//				max = addition;
//			}
//			if(addition < min){
//				min = addition;
//			}
//		}
		System.out.println((sum - max) +" "+ (sum - min) +" "+sum);
		
	}

}






