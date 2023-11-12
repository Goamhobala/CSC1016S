
public class LinkedList {
    private Node head;
    private Node current;
    
    class Node{
        Object data;
        Node link;
        Node(Object data, Node link){
            this.data = data;
            this.link = link;
        }

        Node getLink(){
            return this.link;
        }
    }

    public LinkedList(){
        this.head = null;
        this.current = head;
    }

    public void setNode(Object data, Node link){
        this.current = new Node(data,null);
        this.current = current.getLink();
    }

    public Object find(){
        
    }

}
