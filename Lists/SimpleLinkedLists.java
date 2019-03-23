/**
 *
 * @author sourav
 */

// This is the main class for Employee class , EmployeeLinkedList class and MyNodes class.
// Here we are just creating a linked list, adding elements to the begining and removing them form the begining.
 
class apples{
    
    public static void main(String[] args){
        
        Employee employee1 = new Employee("Dan", "Smith", 1234);
        Employee employee2 = new Employee("Chester", "Bennington", 4567);
        Employee employee3 = new Employee("Mike", "Shinoda", 8904);
        Employee employee4 = new Employee("Dan", "Reynolds", 7162);
        
        EmployeeLinkedList lists = new EmployeeLinkedList();
        
        System.out.println("\n" + "Is the list Empty -->" + lists.isEmpty());

        
        lists.addToFront(employee1);
        lists.addToFront(employee2);
        lists.addToFront(employee3);
        lists.addToFront(employee4);
        
        lists.printList();
        
        System.out.println("Size of the linked List --> " + lists.getSize());
        System.out.println("\n" + "Is the list Empty -->" + lists.isEmpty());
        
        lists.removeFromFront();
        System.out.println("\n" + "Size of the linked List --> " + lists.getSize());
        lists.printList();
        
    }
    
}
