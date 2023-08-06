/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao.customer.impl;


import java.util.ArrayList;
import java.util.List;
import supermarketlayered.dao.CrudUtil;
import supermarketlayered.dao.customer.ItemDao;
import supermarketlayered.entity.ItemEntity;
import java.sql.ResultSet;
/**
 *  
 * @author HP
 */
public class ItemDaoImpl implements ItemDao {
    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Item VALUES(?,?,?,?,?)", t.getId(), t.getDescription(), t.getPackSize(), t.getUnitPrice(), t.getQty());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE item SET Description=?, PackSize=?, UnitPrice=?, QtyOnHand=? WHERE ItemCode=?", t.getDescription(), t.getPackSize(), t.getUnitPrice(), t.getQty(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE ItemCode=?", id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item WHERE ItemCode=?", id);

        while (rst.next()) {
            return new ItemEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
        }

        return null;
    }

    @Override
    public List<ItemEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item");
        List<ItemEntity> itemEntitys = new ArrayList<>();
        while (rst.next()) {
            itemEntitys.add(new ItemEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5)));
        }

        return itemEntitys;
}
}