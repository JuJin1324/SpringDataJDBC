package com.springdata.jdbc.demo;

import com.springdata.jdbc.demo.entity.UserInfo;
import com.springdata.jdbc.demo.repository.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringdatajdbcApplicationTests {
    @Autowired
    UserInfoRepository repository;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(repository);
        log.debug("[jujin] repository : {}", repository);
    }

    @Test
    public void saveAndConfirmTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("Gold");
        userInfo.setUserName("홍금보");
        userInfo.setEmail("goldGold@gmail.com");
        userInfo.setPassword("1234");

        repository.save(userInfo);
        UserInfo res = repository.findByUserName("홍금보");
        log.debug("[jujin] found : {}", res);
    }

    @Test
    public void findAllUserTest() {
        Iterable<UserInfo> userInfoList = repository.findAll();
        log.debug("[jujin] found All UserInfo : {}", userInfoList);
    }

    @Test
    public void findUserTest() {
        UserInfo userInfo = repository.findByUserName("홍길금");
        log.debug("[jujin] found userInfo : {}", userInfo);
    }
}
