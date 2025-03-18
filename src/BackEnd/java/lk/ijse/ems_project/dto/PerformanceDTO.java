package lk.ijse.ems_project.dto;


import lombok.Data;

@Data
public class PerformanceDTO {
    private Long id;
    private Long employeeId;
    private String review;
    private int rating;
    private String remarks;
}