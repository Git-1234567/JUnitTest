package com.example.springex.Services;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class StudentServices implements StudServices{
    private JdbcTemplate jdbcTemplate;
    public StudentServices(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public void sortByCity()
    {
        List<Map<String, Object>> student=
                jdbcTemplate.queryForList("select sname,dname From student s " +
                        "JOIN department d " +
                        "ON s.dept_id=d.dept_id " +
                        "WHERE s.city='Coimbatore' " +
                        "ORDER BY s.sname ASC ");
        for (Map<String, Object> row : student){
            String sname=(String) row.get("sname");
            String dname=(String) row.get("dname");
            System.out.println(sname + " - " + dname);
        }
    }
}
