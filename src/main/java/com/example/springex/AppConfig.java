package com.example.springex;

import com.example.springex.Repositories.DepartmentDAO;
import com.example.springex.Repositories.StudentDAO;
import com.example.springex.Services.StudentServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    //Bean for Student List
    @Bean
    public StudentDAO studentDAO(){
        return new StudentDAO(dataSource());
    }
    //Bean for Department List
    @Bean
    public DepartmentDAO departmentDAO(){
        return new DepartmentDAO(dataSource());
    }
    //Bean for Student List by city
    @Bean
    public StudentServices studentServices(){
        return new StudentServices(dataSource());
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/employee");
        dataSource.setUsername("root");
        dataSource.setPassword("Deepu@14");
        return dataSource;
    }
}
