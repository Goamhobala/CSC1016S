package linkedList;

import java.util.NoSuchElementException;

public class LinkedListwithIterator<T>{
    
    private class Node<T>{
       T data;
       Node<T> link;
       
       Node(T data, Node<T> link){
        this.data = data;
        this.link = link;
       }
       
       void setLink(Node<T> link){
        this.link = link;
       }
       
       Node<T> getLink(){
        return this.link;
       }
       
       T getData() {
        return this.data;
       }
       
    }
    
    Node<T> head;
    
    public LinkedListwithIterator(){
        this.head = null;
    }
    
    public void addToStart(T data){
        this.head = new Node<T>(data, this.head);
    }
    
    public T removeFromStart(){
        T removed = this.head.getData();
        this.head = this.head.getLink();
        return removed;
    }
    
    public Node<T> find(T data){
        Node<T> current = this.head;
        
        while(current != null){
            if (current.getData().equals(data)){
                return current;
            }
            current = current.getLink();
        }
        return null;
    }
    
    public boolean contains(T data){
        return (this.find(data) != null);
    }
    
    public int size(){
        int count = 0;
        Node<T> current = this.head;
        while (current != null){
           count++;
           current = current.getLink();
        }
        
        return count;
    }
    
    public void outputList(){
        Node<T> current = this.head;
        
        while(current != null){
            System.out.print(current.getData() + " ");
            current = current.getLink();
        }
        
        
    }
    
    public Iterator iterator() {
    	return new Iterator();
    }
        
    public class Iterator{
        private Node<T> previous;
        private Node<T> current;
        
        public Iterator(){
            this.current = head;
            this.previous = null;
        }
        
        public void restart(){
            this.current = head;
            this.previous = null;
        }
        
        public boolean hasNext(){
            return (this.current != null);
        }
        
        public T next(){
        	if (!hasNext()) {
        		throw new NoSuchElementException();
        	}
        	
        	
            this.previous = this.current;
            this.current = this.current.getLink();
            return this.previous.getData();
        }
        
        public T peek() {
        	if (!hasNext()) {
        		throw new IllegalStateException();
        	}
        	return this.current.getData();
        }
        
        public void addHere(T data){
            this.current = new Node(data, this.current);
            this.previous.setLink(this.current);
        }
        
        public T delete(){
            T removed = this.current.getData();
            if (this.previous != null){
                this.previous.setLink(this.current.getLink());
            }
            else{
                this.current = null;
            }
            return removed;
        }
        
        public T changeHere(T data){
            Node<T> nodeAdded = new Node(data, this.current.getLink());
            T changed = this.current.getData();
            if (this.previous != null){
                this.previous.setLink(nodeAdded);
            }
            
            this.current = nodeAdded;
            return changed;
        }
        
        
        
        
    }
}