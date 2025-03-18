package lk.ijse.ems_project.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Attendance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attendanceId;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "check_in_time")
    @Temporal(TemporalType.TIME)
    private Date checkInTime;

    @Column(name = "check_out_time")
    @Temporal(TemporalType.TIME)
    private Date checkOutTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AttendanceStatus status;

    public enum AttendanceStatus {
        PRESENT, ABSENT, LEAVE
    }
}