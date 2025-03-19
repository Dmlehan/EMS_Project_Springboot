package lk.ijse.ems_project.Service.impl;

import lk.ijse.ems_project.Service.AttendanceService;
import lk.ijse.ems_project.entity.Attendance;
import lk.ijse.ems_project.repo.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance getAttendanceById(Integer id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    @Override
    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public Attendance updateAttendance(Integer id, Attendance attendance) {
        Optional<Attendance> existingAttendance = attendanceRepository.findById(id);
        if (existingAttendance.isPresent()) {
            attendance.setAttendanceId(id);
            return attendanceRepository.save(attendance);
        }
        return null;
    }

    @Override
    public void deleteAttendance(Integer id) {
        attendanceRepository.deleteById(id);
    }

    @Override
    public List<Attendance> getAttendanceByEmployee(Integer employeeId) {
        return attendanceRepository.findByEmployee_EmployeeId(employeeId);
    }

    @Override
    public List<Attendance> getAttendanceByDate(Date date) {
        return attendanceRepository.findByDate(date);
    }
}
