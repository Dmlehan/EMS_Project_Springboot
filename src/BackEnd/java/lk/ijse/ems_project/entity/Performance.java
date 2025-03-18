package lk.ijse.ems_project.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Performance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer performanceId;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "review_date")
    @Temporal(TemporalType.DATE)
    private Date reviewDate;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;
}