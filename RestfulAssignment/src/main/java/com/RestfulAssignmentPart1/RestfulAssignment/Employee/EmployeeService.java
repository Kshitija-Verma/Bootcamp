package com.RestfulAssignmentPart1.RestfulAssignment.Employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class EmployeeService {
    private static List<EmployeeBean> employee = new ArrayList<>();
     static Integer usercount=3;

    static{
        employee.add(new EmployeeBean(1,"Kshitija ",21));
        employee.add(new EmployeeBean(2,"Disha ",21));
        employee.add(new EmployeeBean(3,"Anamika ",21));
    }

    public List<EmployeeBean> findAll(){
        return employee;
    }

public EmployeeBean findOne(int id){
        for(EmployeeBean employeeBean: employee){
            if(employeeBean.getId()==id)
                return employeeBean;
        }
        return null;
}
public EmployeeBean deleteById(int id){
    Iterator<EmployeeBean> iterator = employee.iterator();
    while(iterator.hasNext()){
        EmployeeBean employeeBean = iterator.next();
        if(employeeBean.getId()==id)
            iterator.remove();
        return employeeBean;
    }
    return null;
}
public EmployeeBean save(EmployeeBean employeeBean) {
    if (employeeBean.getId() == null) {
    employeeBean.setId(++usercount);
    }
    employee.add(employeeBean);
    return employeeBean;

}
    public EmployeeBean findId(int id) {
        Iterator<EmployeeBean> iterator = employee.iterator();
        while(iterator.hasNext()){
            EmployeeBean employeeBean = iterator.next();
            if(employeeBean.getId()==id)
            return employeeBean;
        }
        return null;
    }
}

