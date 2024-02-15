package linkedList;

//public class Queue<T> {
//	Node<T> head;
//	Node<T> link;
//	
//	public Queue() {
//		this.head = null;
//		this.link = this.head;
//	}
//	
//	public void enqueue(T data) {
//		if (this.head == null) {
//			this.head = new Node<T>(data, new Node<T>());
//			this.link = this.head.getLink();
//		}
//		
//		else {
//			this.link = this.link.setLink(new Node<T>(data, new Node<T>()));
////			this.link = this.link.getLink();
//		}
//	}
//	
//	public T dequeue() {
//		Node<T> current = this.head;
//		
//		while (current != null) {
//			Node<T> previous = current;
//			if (current.getLink().getData() == null) {
//				previous.setLink(null);
//				return current.getData();
//			}
//			else {
//				current = current.getLink();
//			}
//		}
//		return null;
//	}
//
//	public String toString() {
//		
//		String output = "[";
//		Node<T> current = this.head;
//		
//		while(current != null) {
//			output += " " + current.getData().toString();
//			current = current.getLink();
//			if (current.getData() == null) {
//				output += "]";
//			}
//			else {
//				output += ",";
//			}
//		}
//		return output;
//	}	
//}

public class Queue<T>{
	Node<T> head;
	Node<T> tail;
	public Queue() {
	 this.head = null;
	 this.tail = null;
	}
	
	public void enqueue(T data) {
		if (this.head == null) {
			this.head = new Node<T>(data, null);
			this.tail = this.head;
		}
		else {
			this.tail.setLink(new Node<T>(data, null));
			this.tail = this.tail.getLink();
		}
		
		System.out.println(this.tail.getData());
	}
	
	public T dequeue() {
		T removed = null;
		if (this.head == null) {
			System.out.println("The quueue is empty");
		}
		else {
			removed = this.head.getData();
			this.head = this.head.getLink();
		}
		return removed;
	}
	public String toString() {
		
		String output = "[";
		Node<T> current = this.head;
		
		while(current != null) {
			output += " " + current.getData().toString();
			if (current.getLink() == null) {
				output += "]";
			}
			else {
				output += ",";
			}
			current = current.getLink();
		}
		return output;
	}	
}


