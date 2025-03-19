package lk.ijse.ems_project.Service.impl;
import lk.ijse.ems_project.Service.PayrollService;
import lk.ijse.ems_project.entity.Payroll;
import lk.ijse.ems_project.repo.PayrollRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayrollServiceImpl implements PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;

    @Override
    public List<Payroll> getAllPayrolls() {
        return payrollRepository.findAll();
    }

    @Override
    public Payroll getPayrollById(Integer id) {
        return payrollRepository.findById(id).orElse(null);
    }

    @Override
    public Payroll savePayroll(Payroll payroll) {
        return payrollRepository.save(payroll);
    }

    @Override
    public Payroll updatePayroll(Integer id, Payroll payroll) {
        Optional<Payroll> existingPayroll = payrollRepository.findById(id);
        if (existingPayroll.isPresent()) {
            payroll.setPayrollId(id);
            return payrollRepository.save(payroll);
        }
        return null;
    }

    @Override
    public void deletePayroll(Integer id) {
        payrollRepository.deleteById(id);
    }

    @Override
    public List<Payroll> getPayrollsByEmployee(Integer employeeId) {
        return payrollRepository.findByEmployee_EmployeeId(employeeId);
    }
}
