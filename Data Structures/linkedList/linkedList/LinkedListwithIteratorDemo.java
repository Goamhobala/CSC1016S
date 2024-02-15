package linkedList;

public class LinkedListwithIteratorDemo {
	    public static void main(String[] args) {
	        LinkedListwithIterator list = new LinkedListwithIterator();
	        LinkedListwithIterator.Iterator i = list.iterator();

	        list.addToStart("shoes");
	        list.addToStart("orange juice");
	        list.addToStart("coat");
	        
	        list.outputList();
	        System.out.println("List contains:");
	        
	        i.restart();
	        while (i.hasNext())
	            System.out.print(i.next());
	        System.out.println();

	        i.restart();
	        i.next();

	        System.out.println("Will delete the node for " + i.peek());
	        i.delete();

	        System.out.println("List now contains:");
	        i.restart();
	        while (i.hasNext())
	            System.out.println(i.next());
	        System.out.println();

	        i.restart();
	        i.next();

	        System.out.println("Will add one node before " + i.peek());
	        i.addHere("socks");

	        System.out.println("List now contains:");
	        i.restart();
	        while (i.hasNext())
	            System.out.println(i.next());
	        System.out.println();

	        System.out.println("Changing all items to credit card.");
	        i.restart();
	        while (i.hasNext()) {
	            i.changeHere("credit card");
	            i.next();
	        }

	        System.out.println();
	        System.out.print("List now contains:");
	        i.restart( );
	        while(i.hasNext( ))
	            System.out.println(i.next( ));
	        System.out.println( );
	    }
	

}
