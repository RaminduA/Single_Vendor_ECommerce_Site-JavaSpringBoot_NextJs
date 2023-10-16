package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class InventoryDTO {
    private String inventory_id;
    private String product_id;
    private String warehouse_id;
    private int count;
}