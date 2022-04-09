import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * ä½¿ç”¨ exceptionally() å›žè°ƒå¤„ç�†å¼‚å¸¸
 *
  * @date 2018-11-27
 */
@Deprecated
public class CompletableFutureExample10  {

    public static void main(String[] args) {
    	Integer age = -1;
    	Test t =new Test();
		/*
		 * 
		 * Integer age = -1;
		 * 
		 * CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(()
		 * -> { if (age < 0) { throw new
		 * IllegalArgumentException("Age can not be negative"); } if (age > 18) { return
		 * "Adult"; } else { return "Child"; } }).exceptionally(ex -> {
		 * System.out.println("Oops! We have an exception - " + ex.getMessage()); return
		 * "Unknown!"; });

	System.out.println("arun"+Thread.currentThread().getName());
	
	/*
	 * CompletableFuture<String> response=CompletableFuture
	 * .completedFuture("1/0"+1/0) .exceptionally(ex -> {
	 * System.out.println("Oops! We have an exception - " + ex.getMessage());
	 * 
	 * return "Unknown!";
	 * 
	 * }); System.out.println("dd"+response);
	 */
	  try {
		  System.out.println("in main thread="+Thread.currentThread().getName());
		CompletableFuture<String> s=t.getAge();

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 // t.wait(100);
	  //System.out.println("after result"+s.get());
        System.out.println("test");


    }
}


