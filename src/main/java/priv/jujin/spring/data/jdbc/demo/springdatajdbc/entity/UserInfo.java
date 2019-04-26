package priv.jujin.spring.data.jdbc.demo.springdatajdbc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

/**
 * @author yjj(Yoo Ju Jin)
 * Created 26/04/2019
 * resources/schema.sql 의 USER_INFO 테이블에 해당하는 Entity
 * @Column 애노테이션은 필드와 이름이 일치하는 경우 필요없으며
 * 필드와 이름이 일치하지 않는 경우에 DB 테이블의 필드와 Entity의 필드를 맵핑하는데 사용한다.
 */

@Getter
@Setter
@ToString
public class UserInfo {
    @Id
    private Long id;

    private String password;
    @Column("user_name")
    private String userName;
    private String email;
}
