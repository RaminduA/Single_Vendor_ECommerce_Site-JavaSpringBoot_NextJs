package com.martymart.entity;

/*
Warehouses Table:
- warehouse_id (varchar, primary key)
- warehouse_name (varchar)
- warehouse_address (varchar)
*/

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Warehouse {
    @Id
    @Column(length = 6)
    private String warehouse_id;
    @Column(nullable = false, length = 25)
    private String warehouse_name;
    @Column(nullable = false, length = 60)
    private String warehouse_address;
    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<Inventory> inventories;

    public Warehouse(String warehouse_id, String warehouse_name, String warehouse_address) {
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.inventories = new ArrayList<Inventory>();
    }
}
