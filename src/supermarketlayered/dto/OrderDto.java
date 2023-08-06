/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dto;

import java.util.List;
/**
 *
 * @author HP
 */
public class OrderDto {
    private String id;
    private String custId;
    
    private List<OrderDetailDto> orderDetailDtos;

    public OrderDto() {
    }

    public OrderDto(String id, String custId, List<OrderDetailDto> orderDetailDtos) {
        this.id = id;
        this.custId = custId;
        this.orderDetailDtos = orderDetailDtos;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the orderDetailDtos
     */
    public List<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    /**
     * @param orderDetailDtos the orderDetailDtos to set
     */
    public void setOrderDetailDtos(List<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "id=" + id + ", custId=" + custId + ", orderDetailDtos=" + orderDetailDtos + '}';
    }

    
    
    
}
