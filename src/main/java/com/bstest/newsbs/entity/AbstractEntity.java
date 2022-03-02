package com.bstest.newsbs.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public class AbstractEntity {
    @Id
    private String id;

    @CreationTimestamp
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;
}
