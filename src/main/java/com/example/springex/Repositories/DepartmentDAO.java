package com.example.springex.Repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class DepartmentDAO implements DeptDAO{
    private JdbcTemplate jdbcTemplate;
    public DepartmentDAO(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public List<Map<String, Object>> getDept()
    {
        List<Map<String, Object>> deptlist=this.jdbcTemplate.queryForList(
                "select * from department"
        );
        return deptlist;
    }
}
