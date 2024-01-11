package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(EmployeeDto employeeDto);

}
