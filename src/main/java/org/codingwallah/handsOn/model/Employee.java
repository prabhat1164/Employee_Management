package org.codingwallah.handsOn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String email;
    private  String phone;

}

//instead of creating getter and setter for all variables we use lombok (@Data annotation used)