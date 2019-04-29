package com.springdata.jdbc.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author yjj(Yoo Ju Jin)
 * Created 26/04/2019
 *
 * USER_INFO 테이블에 해당하는 Entity
 * @Table
 * spring-data-jdbc는 테이블 대소문자를 구분한다.
 * Repository에 @Query 애노테이션으로 만든 쿼리를 제외한 기본 메서드들에서
 * 테이블명은 소문자로 동작한다.
 * 따라서, 테이블명이 대문자인 경우 해당 애노테이션을 통해서 이름을 지정한다.
 *
 * @Column
 * 필드와 이름이 일치하는 경우 필요없으며
 * 필드와 이름이 일치하지 않는 경우에 DB 테이블의 필드와 Entity의 필드를 맵핑하는데 사용한다.
 *
 * @Transient
 * DB 테이블에서 가져오지 않는 값
 * Entity 클래스에 필드 정의할 때 DB 테이블에 없는 값은 Transient 애노테이션을 붙여서 처리한다.
 */

@Getter
@Setter
@ToString
@Table("USER_INFO")
public class UserInfo {
    @Id
    private Long idx;

    private String id;
    private String password;
    @Column("user_name")
    private String userName;
    private String email;

    @Transient
    private String etc;
}
