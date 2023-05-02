package com.example.springex.Repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
@Repository
public class StudentDAO implements StudDAO{
    private JdbcTemplate jdbcTemplate;
    public StudentDAO(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public List<Map<String, Object>> getStudent() {
        List<Map<String, Object>> stlist = this.jdbcTemplate.queryForList(
                "select * from student"
        );
        return stlist;
    }
}
