package ma.dnaengineering.backend.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ma.dnaengineering.backend.Entities.Employee;

@Service
public class EmployeeService {

    public Map<String,Double> calculateAverageSlaryByJobTitle(List<Employee> employees){

        return employees.stream()
        .collect(Collectors.groupingBy(Employee::getJob_title,Collectors.averagingDouble(Employee::getSalary)));
        
    }


    
}
