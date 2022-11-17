package com.sg.FlooringProject.dao;

import com.sg.FlooringProject.dto.Orders;

import java.time.LocalDate;

public interface OrdersDAO {
Orders addOrders(int OrderNumber, LocalDate orderDate);

}
