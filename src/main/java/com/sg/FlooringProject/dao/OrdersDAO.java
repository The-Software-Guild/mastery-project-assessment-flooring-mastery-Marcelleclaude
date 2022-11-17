package com.sg.FlooringProject.dao;

import com.sg.FlooringProject.dto.Orders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface OrdersDAO {
Orders addOrders(int OrderNumber, LocalDate orderDate);

List<Orders> getAllOrders();
List<Integer> getAllOrderNumber();

Orders getOrders (int OrderNumber,LocalDate orderDate);

Orders CreateNewOrder(String newCustomerName, String newOrderState,
                      String productType, BigDecimal newOrderArea);

void addNewOrderToFile(LocalDate newOrderDate, Orders newOrder);
Orders createEditedOrder(Orders order, String newName,
                            String newState, String newProductType,
                            BigDecimal newArea);

void writeEditOrder(LocalDate orderDate, Orders orderToEdit, Orders editedOrder);

Orders removeOrder(int OrderNumber);
void exportAllData();


}
