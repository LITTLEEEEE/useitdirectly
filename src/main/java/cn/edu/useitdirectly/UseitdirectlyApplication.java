package cn.edu.useitdirectly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value ="cn.edu.useitdirectly.Dao")
public class UseitdirectlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(UseitdirectlyApplication.class, args);
    }

}
