package com.martymart.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class WarehouseDTO {
    private String warehouse_id;
    private String warehouse_name;
    private String warehouse_address;
    @ToString.Exclude
    private List<InventoryDTO> inventories;

    public WarehouseDTO(String warehouse_id, String warehouse_name, String warehouse_address) {
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.inventories = new ArrayList<InventoryDTO>();
    }
}
