package org.example.springjdkhm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/my_database");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        var jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "SELECT * FROM users";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        for (Map<String, Object> row : results) {
            System.out.println("ID: " + row.get("id") + ", Name: " + row.get("name") + ", Email: " + row.get("email"));
        }
    }
}

