CREATE TABLE user
(
    id VARCHAR(32) NOT NULL
        PRIMARY KEY COMMENT '用户ID',
    username VARCHAR(64) NOT NULL COMMENT '用户名',
    password VARCHAR(64) NOT NULL COMMENT '加密后的密码',
    gender VARCHAR(255) NULL COMMENT '性别',
    nickname VARCHAR(64) NULL COMMENT '用户昵称',
    locked tinyint(1) DEFAULT 0 NOT NULL COMMENT '是否锁定，1-是，0-否',
    enabled tinyint(1) DEFAULT 1 NOT NULL COMMENT '是否可用，1-是，0-否',
    CONSTRAINT uk_user_username
        UNIQUE (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT '用户表';