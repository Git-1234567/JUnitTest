package com.example.springex;

import com.example.springex.Repositories.DeptDAO;
import com.example.springex.Repositories.StudDAO;
import com.example.springex.Services.StudServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExApplication.class, args);
        //AppConfig
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //calling Student List by StudDAO(interface) reference
        StudDAO studDAO=context.getBean(StudDAO.class);
        System.out.println("\n"+studDAO.getStudent()+"\n");

        //calling department list by DeptDAO(interface) reference
        DeptDAO deptDAO=context.getBean(DeptDAO.class);
        System.out.println(deptDAO.getDept()+"\n");

        //calling Student List by city using StudServices(interface) reference
        StudServices studServices=context.getBean(StudServices.class);
        studServices.sortByCity();
    }

}
