/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import supermarketlayered.dto.OrderDto;
import supermarketlayered.service.SuperService;
/**
 *
 * @author HP
 */
public interface OrderService extends SuperService{
    
    String placeOrder(OrderDto dto) throws Exception;
    
}