import java.util.Vector;

/**
 *
 * @author sourav
 */

// We know that Vector and ArrayList are different but how, we will see here.
// We got to know that default capacity of Vector is 10, and each time it reaches limit it increases by 100%.
// It takes a lot of memory each and every time
// It is synchronized, so it is thread safe.
// As it is thread safe, it has many overhead jobs, which makes it slow. 
 
class apples{
    
    public static void main(String[] args){
        
        Vector v = new Vector();
        
        v.add(2);
        v.add(14);
        v.add(3);
        v.add(12);
        v.add(7);
        v.add("Hello");
        v.add('c');
        v.add(12.9);
        v.add(-23);
        v.add(19);          // If you comment all the v.add() below you will see that both size & capacity is 10 here.
        v.add(14);          // Now all of a sudden the value of the capacity is 20. From 10 to 20.
        v.add(23);
        v.add("Funk");
        v.add('b');
        v.add(-4);
        v.add(5);
        v.add(7);
        v.add(6);
        v.add(19);
        v.add(17);
        v.add(14);
        v.add(-7);
        v.add(8.03);
        v.add(23);
        v.add("Funk");
        v.add('b');
        v.add(-4);
        v.add(5);
        v.add(7);
        v.add(6);
        v.add(19);
        v.add(17);
        v.add(14);
        v.add(-7);
        v.add(8.03);
        v.add(19);
        v.add(17);
        v.add(14);
        v.add(-7);
        v.add(8.03);    // Now again here size and capacity is 40.
        v.add(10);      // Now the capacity has increased from 40 to 80. 40 --> 80.
        v.add(11);      // So the capacity will be 10 --> 20 --> 40 --> 80 --> 160 and so on
        
        
        
        v.forEach(value -> System.out.println(value));
        
        System.out.println("\n");
        System.out.println("This is the size of the vector --> " + v.size());
        
        System.out.println("\n");
        System.out.println("This is the capacity of the vector --> " + v.capacity());
        
    }
    
}
