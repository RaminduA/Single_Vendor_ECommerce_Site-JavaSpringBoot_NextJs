package com.martymart.dto;

public class SubcategoryDTO {
    private String subcategory_id;
    private String subcategory_name;
    private String parent_category_id;

    public SubcategoryDTO() {
    }

    public SubcategoryDTO(String subcategory_id, String subcategory_name, String parent_category_id) {
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.parent_category_id = parent_category_id;
    }

    public String get_subcategory_id() {
        return subcategory_id;
    }

    public String get_subcategory_name() {
        return subcategory_name;
    }

    public String get_parent_category_id() {
        return parent_category_id;
    }

    public void set_subcategory_id(String subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public void set_subcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

    public void set_parent_category_id(String parent_category_id) {
        this.parent_category_id = parent_category_id;
    }

    @Override
    public String toString() {
        return "Subcategory{" + "subcategory_id=" + subcategory_id + ", subcategory_name=" + subcategory_name + ", parent_category_id=" + parent_category_id + '}';
    }

}
