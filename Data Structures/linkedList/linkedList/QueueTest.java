package linkedList;

public class QueueTest {
	public static void main(String[] args) {
		Queue list = new Queue();
	      
	      list.enqueue("alpha");
	      list.enqueue("beta");
	      list.enqueue("charlie");
	      list.enqueue("delta");
	           
	      System.out.println(list.toString());
	      
	      list.dequeue();
	      list.dequeue();
	      
	      System.out.println();
	      System.out.println(list.toString());
	      
//	      System.out.println();
//	      System.out.println(list.contains("delta"));
//	      System.out.println(list.contains("alpha"));
	}
}
