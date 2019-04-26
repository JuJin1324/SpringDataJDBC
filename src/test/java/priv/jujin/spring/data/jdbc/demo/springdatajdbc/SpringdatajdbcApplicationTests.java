package priv.jujin.spring.data.jdbc.demo.springdatajdbc;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import priv.jujin.spring.data.jdbc.demo.springdatajdbc.repository.UserInfoRepository;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJdbcTest
@Slf4j
public class SpringdatajdbcApplicationTests {
//    @Autowired
//    DataSource dataSource;

    @Autowired
    UserInfoRepository repository;

    @Test
    public void contextLoads() {
//        Assert.assertNotNull(dataSource);
//        log.debug("datasource : {}", dataSource);

        Assert.assertNotNull(repository);
        log.debug("repository: {}", repository);
    }


}
