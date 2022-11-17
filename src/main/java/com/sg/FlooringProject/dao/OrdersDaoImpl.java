package com.sg.FlooringProject.dao;

import com.sg.FlooringProject.dto.Orders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersDaoImpl implements OrdersDAO{

    private Map<Integer, Orders> orders =new HashMap<>();
    private final String DELIMITER = ",";

    @Override
    public Orders addOrders(int OrderNumber, LocalDate orderDate) {
        return null;
    }

    @Override
    public List<Orders> getAllOrders() {
        return null;
    }

    @Override
    public List<Integer> getAllOrderNumber() {
        return null;
    }

    @Override
    public Orders getOrders(int OrderNumber, LocalDate orderDate) {
        return null;
    }

    @Override
    public Orders CreateNewOrder(String newCustomerName, String newOrderState, String productType, BigDecimal newOrderArea) {
        return null;
    }

    @Override
    public void addNewOrderToFile(LocalDate newOrderDate, Orders newOrder) {

    }

    @Override
    public Orders createEditedOrder(Orders order, String newName, String newState, String newProductType, BigDecimal newArea) {
        return null;
    }

    @Override
    public void writeEditOrder(LocalDate orderDate, Orders orderToEdit, Orders editedOrder) {

    }

    @Override
    public Orders removeOrder(int OrderNumber) {
        return null;
    }

    @Override
    public void exportAllData() {

    }
}
