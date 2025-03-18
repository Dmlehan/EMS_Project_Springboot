package lk.ijse.ems_project.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PayrollDTO {
    private Long id;
    private Long employeeId;
    private BigDecimal salary;
    private LocalDate paymentDate;
    private String status;
}