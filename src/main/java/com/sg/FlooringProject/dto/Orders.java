package com.sg.FlooringProject.dto;

import java.math.BigDecimal;

public class Orders {
    private int OrderNumber;
    private String CustomerName;
    private String State;
    private BigDecimal TaxRate;
    private String ProductType;
    private BigDecimal Area;
    private BigDecimal CostPerSquareFoot;
    private BigDecimal MaterialCost;
    private BigDecimal LaborCost;

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public BigDecimal getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        TaxRate = taxRate;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public BigDecimal getArea() {
        return Area;
    }

    public void setArea(BigDecimal area) {
        Area = area;
    }

    public BigDecimal getCostPerSquareFoot() {
        return CostPerSquareFoot;
    }

    public void setCostPerSquareFoot(BigDecimal costPerSquareFoot) {
        CostPerSquareFoot = costPerSquareFoot;
    }

    public BigDecimal getMaterialCost() {
        return MaterialCost;
    }

    public void setMaterialCost(BigDecimal materialCost) {
        MaterialCost = materialCost;
    }

    public BigDecimal getLaborCost() {
        return LaborCost;
    }

    public void setLaborCost(BigDecimal laborCost) {
        LaborCost = laborCost;
    }

    public BigDecimal getTax() {
        return Tax;
    }

    public void setTax(BigDecimal tax) {
        Tax = tax;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public void setTotal(BigDecimal total) {
        Total = total;
    }

    private BigDecimal Tax;
    private BigDecimal Total;
}
