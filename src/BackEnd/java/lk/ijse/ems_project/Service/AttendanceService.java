package lk.ijse.ems_project.Service;

import lk.ijse.ems_project.entity.Attendance;
import java.util.Date;
import java.util.List;

public interface AttendanceService {
    List<Attendance> getAllAttendances();
    Attendance getAttendanceById(Integer id);
    Attendance saveAttendance(Attendance attendance);
    Attendance updateAttendance(Integer id, Attendance attendance);
    void deleteAttendance(Integer id);
    List<Attendance> getAttendanceByEmployee(Integer employeeId);
    List<Attendance> getAttendanceByDate(Date date);
}
