package lk.ijse.ems_project;  // Ensure this matches your actual package structure

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmsProjectApplication {  // Ensure the file name is EmsProjectApplication.java

    public static void main(String[] args) {
        SpringApplication.run(EmsProjectApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
