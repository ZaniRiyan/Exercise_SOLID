
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishindo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee("Employee1");
        Employee manager = new Employee("Mamang");
        Employee employee2 = new Employee("Employee2");
        
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(manager);
        employeeList.add(employee2);
        
        DetailsPrinter printer = new DetailsPrinter(employeeList);
        printer.printDetails();
    }
    
}
