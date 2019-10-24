package com.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table (name = "collateral")
public class Collateral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    public Long Id;

    @Column(name = "property_name")
    public String propertyName;

    @Column(name = "status")
    public String status;

    @Column(name = "borrowers_name")
    public String borrowersName;

    @Column(name = "condition")
    public String condition;

    @Column(name = "property_value")
    public Long property_value;

    public Collateral(){}
}
