package org.codingwallah.handsOn.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="employee_db")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private  String phone;
}
//@Id means we are setting it primary key jis field pe ye annotation use hua hai
//@GeneratedValue(strategy = GenerationType.IDENTITY) means if we don't pass id then automatically add it
//@Table(name="employee_db") employee_db is name of table if we don't specify it then it will take className as tableName