package com.tuxglobal.gtipos.model;

import java.util.Date;

import javax.persistence.Column;

public class BaseEntity {
    
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
}
