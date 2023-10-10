package com.martymart.dto;

public class WarehouseDTO {
    private String warehouse_id;
    private String warehouse_name;
    private String warehouse_address;

    public WarehouseDTO() {
    }

    public WarehouseDTO(String warehouse_id, String warehouse_name, String warehouse_address) {
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
    }

    public String get_warehouse_id() {
        return warehouse_id;
    }

    public String get_warehouse_name() {
        return warehouse_name;
    }

    public String get_warehouse_address() {
        return warehouse_address;
    }

    public void set_warehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public void set_warehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public void set_warehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    @Override
    public String toString() {
        return "Warehouse{" + "warehouse_id=" + warehouse_id + ", warehouse_name=" + warehouse_name + ", warehouse_address=" + warehouse_address + '}';
    }
}
