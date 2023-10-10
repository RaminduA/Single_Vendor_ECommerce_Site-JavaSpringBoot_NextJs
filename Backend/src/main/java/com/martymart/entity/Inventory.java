package com.martymart.entity;

/*
Inventory Table:
- inventory_id (varchar, primary key)
- product_id (varchar, foreign key)
- warehouse_id (varchar, foreign key)
- count (int)
*/

public class Inventory {
    private String inventory_id;
    private String product_id;
    private String warehouse_id;
    private int count;

    public Inventory() {
    }

    public Inventory(String inventory_id, String product_id, String warehouse_id, int count) {
        this.inventory_id = inventory_id;
        this.product_id = product_id;
        this.warehouse_id = warehouse_id;
        this.count = count;
    }

    public String get_inventory_id() {
        return this.inventory_id;
    }

    public String get_product_id() {
        return this.product_id;
    }

    public String get_warehouse_id() {
        return this.warehouse_id;
    }

    public int get_count() {
        return this.count;
    }

    public void set_inventory_id(String inventory_id) {
        this.inventory_id = inventory_id;
    }

    public void set_product_id(String product_id) {
        this.product_id = product_id;
    }

    public void set_warehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public void set_count(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventory_id=" + inventory_id + ", product_id=" + product_id + ", warehouse_id=" + warehouse_id + ", count=" + count + '}';
    }
}