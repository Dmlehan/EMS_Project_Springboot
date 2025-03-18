package lk.ijse.ems_project.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String position;
    private LocalDate dateOfJoining;
    private Long departmentId;
}