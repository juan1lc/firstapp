package com.bstest.newsbs.entity;

import com.bstest.newsbs.enums.Gender;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class User extends AbstractEntity{

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String nickname;

    private Boolean locked;

    private Boolean enabled;

    private String lastLoginip;

    private Date lastLoginTime;
}
