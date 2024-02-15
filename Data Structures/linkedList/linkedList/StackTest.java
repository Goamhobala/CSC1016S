package linkedList;

public class StackTest {
	public static void main(String[] args) {
	     Stack list = new Stack();
	      
	      list.push("alpha");
	      list.push("beta");
	      list.push("charlie");
	      list.push("delta");
	           
	      System.out.println(list.toString());
	      
	      list.pop();
	      list.pop();
	      
	      System.out.println();
	      System.out.println(list.toString());
	      
	      System.out.println();
	      System.out.println(list.contains("delta"));
	      System.out.println(list.contains("alpha"));
	}

}
