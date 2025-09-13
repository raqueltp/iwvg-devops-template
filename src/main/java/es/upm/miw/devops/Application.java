package es.upm.miw.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) // Not API: /error
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);// mvn clean spring-boot:run

        //hola i5
    }
    //i1
    //i1-2
//i7
    //i7-2
    //i1-3
    //i1-4
    //i1-5
// i8
}
