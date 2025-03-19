package lk.ijse.ems_project.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {
    private String username;
    private String password;
    private String email;
    private String role; // ADMIN or EMPLOYEE
}
