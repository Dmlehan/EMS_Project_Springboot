package lk.ijse.ems_project.Service;
import lk.ijse.ems_project.entity.Payroll;

import java.util.List;

public interface PayrollService {
    List<Payroll> getAllPayrolls();
    Payroll getPayrollById(Integer id);
    Payroll savePayroll(Payroll payroll);
    Payroll updatePayroll(Integer id, Payroll payroll);
    void deletePayroll(Integer id);
    List<Payroll> getPayrollsByEmployee(Integer employeeId);
}
