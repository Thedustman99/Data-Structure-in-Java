import java.util.ArrayList;

/**
 *
 * @author sourav
 */

// We got to know that there is no method named capacity for ArrayList.
// It is asynchronized, so it is not thread safe.
// As it is not thread safe, it has no overhead jobs, which makes it faster than Vector. 
// We use this more than Vector. 

class apples{
    
    public static void main(String[] args){
        
        ArrayList myList = new ArrayList();
        
        myList.add(12);
        myList.add(2);
        myList.add(14);
        myList.add(3);
        myList.add(8.03);
        myList.add(23);
        myList.add("Funk");
        myList.add('b');
        myList.add(12);
        myList.add(7);
        myList.add(-23);
        myList.add(19);
        myList.add(-4);
        myList.add(5);
        myList.add(7);
        myList.add(6);
        myList.add(19);
        myList.add(17);
        myList.add(14);
        myList.add(-7);
        myList.add("Hello");
        myList.add('c');
        myList.add(12.9);
        
        myList.forEach(value -> System.out.println(value));
        
        System.out.println("\n");
        System.out.println("This is the size of the vector --> " + myList.size());   
    }
}
