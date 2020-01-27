package com.waviz.mybatis.mybatisexamples;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import com.waviz.mybatis.mybatisexamples.model.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.waviz.mybatis.mybatisexamples.mapper")
@SpringBootApplication
public class MybatisExamplesApplication {
  
/*private final UsersMapper usersMapper;
/public MybatisExamplesApplication(UsersMapper usersMapper)
{
this.usersMapper = usersMapper;
}
*/
	public static void main(String[] args) {
		SpringApplication.run(MybatisExamplesApplication.class, args);
	}

}


