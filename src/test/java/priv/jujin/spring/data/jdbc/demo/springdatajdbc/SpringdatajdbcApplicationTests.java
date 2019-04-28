package priv.jujin.spring.data.jdbc.demo.springdatajdbc;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import priv.jujin.spring.data.jdbc.demo.springdatajdbc.entity.UserInfo;
import priv.jujin.spring.data.jdbc.demo.springdatajdbc.repository.UserInfoRepository;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringdatajdbcApplicationTests {
    @Autowired
    UserInfoRepository repository;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(repository);
        log.debug("================== repository : {}", repository);
    }

    @Test
    public void saveAndConfirmTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("hong");
        userInfo.setUserName("홍길금");
        userInfo.setEmail("gold@gmail.com");
        userInfo.setPassword("1234");

        repository.save(userInfo);
        UserInfo res = repository.findByUserName("홍길금");
        log.debug("================== found : {}", res);
    }

    @Test
    public void findAllUserTest() {
        Iterable<UserInfo> userInfoList = repository.findAll();
        log.debug("===================== found All UserInfo : {}", userInfoList);
    }

    @Test
    public void findUserTest() {
        UserInfo userInfo = repository.findByUserName("홍길금");
        log.debug("============= found userInfo : {}", userInfo);
    }
}
