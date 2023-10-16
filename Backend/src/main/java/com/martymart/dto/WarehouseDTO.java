package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class WarehouseDTO {
    private String warehouse_id;
    private String warehouse_name;
    private String warehouse_address;
}
