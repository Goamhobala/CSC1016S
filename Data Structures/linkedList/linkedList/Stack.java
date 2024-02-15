package linkedList;

public class Stack<T>{
	private Node<T> head;
	private Node<T> link;
	
	public Stack() {
		this.head = null;
		this.link = null;
	}
	
	public void push(T data) {
		this.head = new Node<T>(data, this.head);
	}
	
	public T pop() {
		T removed = this.head.getData();
		this.head = this.head.getLink();
		return removed;
	}	
	
	/**
	 * @param data
	 * @return The index of the first occurrence of the data. Return -1 if not found.
	 */
	public int find(T data) {
		
		Node<T> current = this.head;
		int position = 0;
		
		while(current != null) {
			if (current.getData().equals(data)) {
				return position;
			}
			position++;
			current = current.getLink();
		}
		return -1;
	}
	
	public boolean contains(T data) {
		return (this.find(data) != -1);
	}
	
	/**
	 *	Output the linked list as a string;
	 */
	public String toString() {
		
		String output = "[";
		Node<T> current = this.head;
		
		while(current != null) {
			output += " " + current.getData().toString();
			current = current.getLink();
			if (current == null) {
				output += "]";
			}
			else {
				output += ",";
			}
		}
		return output;
	}
	
}
