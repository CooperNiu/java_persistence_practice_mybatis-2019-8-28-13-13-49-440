package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tws.Entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Select("select id, name, age from employee")
    public List<Employee> selectAll();
}
