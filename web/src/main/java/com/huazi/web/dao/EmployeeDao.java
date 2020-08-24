package com.huazi.web.dao;

import com.huazi.web.pojo.Department;
import com.huazi.web.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    //
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "AA", "A1894783@QQ.COM", 0, new Department(101, "教研部")));
        employees.put(1002, new Employee(1002, "BB", "B1894783@QQ.COM", 1, new Department(101, "后勤部")));
        employees.put(1003, new Employee(1003, "CC", "C1894783@QQ.COM", 0, new Department(101, "市场部")));
        employees.put(1004, new Employee(1004, "DD", "D1894783@QQ.COM", 1, new Department(101, "运营部")));
        employees.put(1005, new Employee(1005, "EE", "E1894783@QQ.COM", 0, new Department(101, "教研部")));
    }
    private static Integer initId = 1006;

    public void save(Employee employee){
        if (employee.getId() == null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.geDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }
}
