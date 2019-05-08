package priv.jujin.spring.data.jdbc.demo.springdatajdbc.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import priv.jujin.spring.data.jdbc.demo.springdatajdbc.entity.UserInfo;

import java.util.List;

/**
 * @author yjj(Yoo Ju Jin)
 * Created 26/04/2019
 *
 * @Repository 애노테이션도 필요없이 Spring-Data-Commons의 CrudRepository만 상속받아서
 * 사용하면 된다.
 * CrudRepository<엔티티 자료형, 엔티티 아이디 자료형>
 */

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    @Query("SELECT " +
            "USER_INFO.idx AS idx, " +
            "USER_INFO.id AS id, " +
            "USER_INFO.password AS password, " +
            "USER_INFO.user_name AS user_name, " +
            "USER_INFO.email AS email " +
            "FROM USER_INFO where USER_INFO.user_name =:user_name")
    UserInfo findByUserName(@Param("user_name") String userName);

    @Query("SELECT * FROM USER_INFO where id=:id")
    UserInfo findOneById(@Param("id") String id);

    @Query("SELECT " +
            "USER_INFO.idx AS idx, " +
            "USER_INFO.id AS id, " +
            "USER_INFO.password AS password, " +
            "USER_INFO.user_name AS user_name, " +
            "USER_INFO.email AS email " +
            "FROM USER_INFO " +
            "WHERE USER_INFO.user_name IN (:targetIdList)")
    List<UserInfo> findAllByIdList(@Param("targetIdList") List<String> targetIdList);
}
