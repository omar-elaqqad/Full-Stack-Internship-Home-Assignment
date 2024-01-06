package ma.dnaengineering.backend.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ma.dnaengineering.backend.Entities.Employee;

@Service
public class CSVParserService {

    /**/
    public List<Employee> readCSV(String filePath) throws IOException{

        List<Employee> employees=new ArrayList<>();

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath))) {

            bufferedReader.readLine();

            String Line;

            while ((Line=bufferedReader.readLine()) !=null) {

                String[] fields=Line.split(",");

                for(int i=0;i<fields.length;i++){
                    fields[i]=fields[i].trim();
                }


                Long Id=Long.parseLong(fields[0]);
                String name=fields[1];
                String job_title=fields[2];
                double salary=Double.parseDouble(fields[3]);

                employees.add(new Employee(Id, name, job_title, salary));

                
            }

        }

        return employees ;

    }
    
}
