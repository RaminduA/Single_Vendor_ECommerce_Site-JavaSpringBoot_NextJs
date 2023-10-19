package com.martymart.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class InventoryDTO {
    private String inventory_id;
    private ProductDTO product;
    private WarehouseDTO warehouse;
    private int count;
}