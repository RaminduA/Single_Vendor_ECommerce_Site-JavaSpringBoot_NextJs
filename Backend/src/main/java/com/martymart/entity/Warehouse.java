package com.martymart.entity;

/*
Warehouses Table:
- warehouse_id (varchar, primary key)
- warehouse_name (varchar)
- warehouse_address (varchar)
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Warehouse {
    @Id
    private String warehouse_id;
    private String warehouse_name;
    private String warehouse_address;
}
