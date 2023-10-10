package com.martymart.dto;

public class CategoryDTO {
    private String category_id;
    private String category_name;

    public CategoryDTO() {
    }

    public CategoryDTO(String category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }

    public String get_category_id() {
        return category_id;
    }

    public String get_category_name() {
        return category_name;
    }

    public void set_category_id(String category_id) {
        this.category_id = category_id;
    }

    public void set_category_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "Category{" + "category_id=" + category_id + ", category_name=" + category_name + '}';
    }
}
