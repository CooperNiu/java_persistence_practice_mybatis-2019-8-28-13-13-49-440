package tws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.mapper.EmployeeMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {

        List<Employee> list = employeeMapper.getAll();
        return ResponseEntity.ok(list);
    }
    /*@GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {

        Employee employee;
        for(Employee e:list){
            if(e.getId() == id){
                return ResponseEntity.ok(e);
            }
        }
        return ResponseEntity.ok(null);
    }
    @GetMapping("/name")
    public ResponseEntity<List<Employee>> getEmployeeByNmae(@RequestParam("name") String  name) {
        List<Employee> retList = new ArrayList<>();
        for(Employee e:list){
            if(e.getName().indexOf(name)!=-1){
                retList.add(e);
            }
        }
        return ResponseEntity.ok(retList);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee) {
        list.add(employee);
        return ResponseEntity.created(null).build();
    }
    @PutMapping(consumes = "application/json")
    public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee) {
        list.add(5,employee);
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Employee>> updateEmployee(@PathVariable int id) {
        Employee employee = null;
        for(Employee e:list){
            if(e.getId() == id){
                employee = e;
            }
        }
        list.remove(employee);
        return ResponseEntity.ok(list);
    }*/
}
