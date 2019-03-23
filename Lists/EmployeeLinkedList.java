/**
 *
 * @author sourav
 */

// In this class we creating 3 main methods namely addToFront, removeFromFront and printList.
// and 2 other methods namely getSize and isEmpty. 
 
class EmployeeLinkedList {
    
    private MyNodes head;
    private int size;
    
    public void addToFront(Employee employee){
        
        MyNodes node = new MyNodes(employee);
        node.setNext(head);
        head = node;
        size++;
        
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public MyNodes removeFromFront(){
        
        if(isEmpty()){
            return null;
        }
        
        MyNodes removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
        
    }
    
    public void printList(){
        
        MyNodes current = head;
        System.out.print("HEAD -->");
        while(current != null){
            System.out.print(current);
            System.out.print("-->");
            current = current.getNext();
        }
        System.out.println("null");
    }
    
}
