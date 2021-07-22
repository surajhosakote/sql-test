package com.sqltest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Family {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String relationship;

}
