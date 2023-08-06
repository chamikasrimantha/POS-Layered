/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao;

import supermarketlayered.dao.customer.impl.CustomerDaoImpl;
import supermarketlayered.dao.customer.impl.ItemDaoImpl;
import supermarketlayered.dao.customer.impl.OrderDaoImpl;
import supermarketlayered.dao.customer.impl.OrderDetailDaoImpl;
/**
 *
 * @author HP
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }
    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        CUSTOMER, ITEM, ORDER, ORDER_DETAIL
    }
}