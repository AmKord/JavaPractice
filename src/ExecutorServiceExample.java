import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class ExecutorServiceExample {
	
	public static void main(String[] args) {
		Integer count =new Integer(10);
		Runnable runnableTask = () -> {
			try {
				TimeUnit.MICROSECONDS.sleep(1000);
				final Integer newCount = new Integer(count +1);
				System.out.println("Current time "+ LocalDateTime.now()+" Thread "+Thread.currentThread()+"COunt"+newCount);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		ExecutorService eService = Executors.newFixedThreadPool(20);
		Future<String> result = null;
		for (int i = 0; i < 300; i++) {
			eService.execute(runnableTask);
			
			result =  eService.submit(runnableTask, "Completed");

		}
				
		
		while(!result.isDone()) {
			try {
				System.out.println("Method return value "+ result.get());
			}
			catch (InterruptedException | ExecutionException e) {
				
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(1000L); //sleep for 1sec
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		eService.shutdown();
	}

}
