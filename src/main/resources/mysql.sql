CREATE TABLE IF NOT EXISTS USER_INFO (
  idx       INTEGER NOT NULL AUTO_INCREMENT,
  id        VARCHAR(100),
  password  VARCHAR(100),
  user_name VARCHAR(100),
  email     VARCHAR(100),
  PRIMARY KEY (idx)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

INSERT INTO USER_INFO (id, user_name, password, email) VALUES ('hong1', '홍길금', '1234', 'gold@gmail.com');
INSERT INTO USER_INFO (id, user_name, password, email) VALUES ('hong2', '홍길은', '5678', 'silver@gmail.com');
INSERT INTO USER_INFO (id, user_name, password, email) VALUES ('hong3', '홍길동', '9101', 'bronz@gmail.com');
INSERT INTO USER_INFO (id, user_name, password, email) VALUES ('tester', 'test', '5678', 'english@gmail.com');