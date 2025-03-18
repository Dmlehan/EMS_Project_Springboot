package lk.ijse.ems_project.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Payroll")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payrollId;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "salary", precision = 10, scale = 2)
    private BigDecimal salary;

    @Column(name = "bonus", precision = 10, scale = 2, columnDefinition = "DECIMAL(10,2) DEFAULT 0")
    private BigDecimal bonus;

    @Column(name = "deductions", precision = 10, scale = 2, columnDefinition = "DECIMAL(10,2) DEFAULT 0")
    private BigDecimal deductions;

    @Column(name = "net_salary", precision = 10, scale = 2, insertable = false, updatable = false)
    private BigDecimal netSalary;

    @Column(name = "pay_date")
    @Temporal(TemporalType.DATE)
    private Date payDate;
}