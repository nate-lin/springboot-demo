package qian.yue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("qian.yue.mapper")
public class Springboot02MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02MybatisApplication.class, args);
	}

}
