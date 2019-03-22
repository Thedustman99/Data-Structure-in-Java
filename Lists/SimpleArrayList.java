import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sourav
 */

class apples{
    
    public static void main(String[] args){

// Here in ArrayList<n> we are entering the value of n(which is capacity) for the list. So by 
// default it will take 10 as its capacity. If you want more than you need to write something there
        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add(new Employee("Dan", "Smith", 1234));
        employeeList.add(new Employee("Chester", "Bennington", 4567));
        employeeList.add(new Employee("Mike", "Shinoda", 8904));
        employeeList.add(new Employee("Dan", "Reynolds", 7162));        

// This is just a way in which we can print every entry in the list. We can use other way to do the samething.        
        employeeList.forEach(employee -> System.out.println(employee));
        
        System.out.println("This will print the employee at index 2");
        System.out.println(employeeList.get(2));
        
        System.out.println("Now we will check whether the list is empty or not");
        System.out.println(employeeList.isEmpty());
        
        System.out.println("Now we will replace an existing employee with another");
        employeeList.set(2, new Employee("John", "Cooper", 7172));
        employeeList.forEach(employee -> System.out.println(employee));
        
        System.out.println("Now we will see the siz of the list we created");
        System.out.println(employeeList.size());

// If you are adding a new entry to the middle of the list then all the entry having higher index will
// shift. If you add it the end of the list it will be O(1) as we will be shifting nothing. But if you are
// adding at the begining of the list it will be O(n) as we will be shifting the whole list.
        System.out.println("Now we will add a new employee to the list");
        employeeList.add(3, new Employee("Billie", "Armstrong", 2467));
        employeeList.forEach(employee -> System.out.println(employee));
        
        System.out.println("\n");

// This is another way of printing every entry in the list
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray){
            System.out.println(employee);
        }

// If you will add the comment in the Employee class for the method hashcodes and equals, then the result
// of below code will change to false
        System.out.println("Now we will check whether the entry we replaced is still present in the list or not");
        System.out.println(employeeList.contains(new Employee("Chester", "Bennington", 4567)));

// Just like the ablove case, if there is comment, the result will be -1.        
        System.out.println("Lets check the index of any entry");
        System.out.println(employeeList.indexOf(new Employee("Dan", "Reynolds", 7162)));

// The method named hashcode and equls are use to check the entry and perform any action on it. If we use 
// comment there we will be unable to do anything.
        
        System.out.println("\n");
        
        System.out.println("Now we will remove the first entry");
        employeeList.remove(0);
        employeeList.forEach(employee -> System.out.println(employee));
    }
    
}
