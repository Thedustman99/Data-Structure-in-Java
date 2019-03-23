/**
 *
 * @author sourav
 */

// Here we are just using getter, setter and toString methods to call everything
 
class MyNodes {
    
    private Employee employee;
    private MyNodes next;
    
    public MyNodes(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public MyNodes getNext() {
        return next;
    }

    public void setNext(MyNodes next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }
}
