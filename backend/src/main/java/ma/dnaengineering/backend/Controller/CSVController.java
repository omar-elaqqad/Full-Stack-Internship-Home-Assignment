package ma.dnaengineering.backend.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.dnaengineering.backend.Entities.Employee;
import ma.dnaengineering.backend.Service.CSVParserService;
import ma.dnaengineering.backend.Service.EmployeeService;


@Controller
public class CSVController {

@Autowired
private CSVParserService csvParserService;

@Autowired
private EmployeeService employeeService;


@GetMapping("/parseddata")
public ResponseEntity<List<Employee>> parceCSV(@RequestParam String filePath) throws IOException{

    try {
        
        List<Employee> parcedData=csvParserService.readCSV(filePath);
        return ResponseEntity.ok(parcedData);

    } catch (Exception e) {
        
        return ResponseEntity.status(500).build();
    }

}

@GetMapping("/employee-summary")
public ResponseEntity<Map<String,Double>> getEmployeeSummary(@RequestParam String filePath) throws IOException{
    try {
        
        List<Employee> employees=csvParserService.readCSV(filePath);
        Map<String,Double> summary=employeeService.calculateAverageSlaryByJobTitle(employees);
        return ResponseEntity.ok(summary);

    } catch (Exception e) {

        return ResponseEntity.status(500).build();
    }
}


@GetMapping("/all-employees")
public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam String filePath) throws IOException{
    try {

        List<Employee> employees=csvParserService.readCSV(filePath);
        return ResponseEntity.ok(employees);

    } catch (Exception e) {

        return ResponseEntity.status(500).build();
    }

}

    
}
