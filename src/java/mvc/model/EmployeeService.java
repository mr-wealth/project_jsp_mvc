/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author brian
 */
public class EmployeeService {
    public List<Employee> getEmployees(){
        return Arrays.asList(new Employee(100, "John", "Carter"),
                new Employee(101, "Tony", "Stark"),
                new Employee(102, "Tom", "Cruise"));
    }
}
