package priv.jujin.spring.data.jdbc.demo.springdatajdbc.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import priv.jujin.spring.data.jdbc.demo.springdatajdbc.entity.UserInfo;

/**
 * @author yjj(Yoo Ju Jin)
 * Created 26/04/2019
 * @Repository 애노테이션도 필요없이 Spring-Data-Commons의 CrudRepository만 상속받아서
 * 사용하면 된다.
 * CrudRepository<엔티티 자료형, 엔티티 아이디 자료형>
 */

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    @Query("SELECT * FROM USER_INFO UI where UI.user_name=:user_name")
    public UserInfo findByUserName(@Param("user_name") String userName);
}
