package com.greenfox.retake.exam.models;

import java.util.List;

public class ApiResponse {

    private String status;
    private List<Product> productList;

    public ApiResponse() {
    }

    public ApiResponse(String status,List<Product> productList) {
        this.productList = productList;
        this.status = status;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
