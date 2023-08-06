/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao.customer.impl;

import java.util.List;
import supermarketlayered.dao.CrudUtil;
import supermarketlayered.dao.customer.OrderDetailDao;
import supermarketlayered.entity.OrderDetailEntity;
/**
 *
 * @author HP
 */
public class OrderDetailDaoImpl implements OrderDetailDao{
    @Override
    public boolean add(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orderdetail VALUES (?,?,?,?)", t.getOrderId(), t.getItemId(), t.getQty(), t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public OrderDetailEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public List<OrderDetailEntity> getAll() throws Exception {
        return null;
    }
}
