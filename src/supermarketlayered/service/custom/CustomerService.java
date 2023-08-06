/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface CustomerService extends SuperService{
    
    public String addCustomer(CustomerDto customerDto) throws Exception;
    
    public ArrayList<CustomerDto> getAllCustomer() throws Exception;

    public CustomerDto searchCustomer(String custId) throws Exception;
    
    CustomerDto getCustomer(String id) throws Exception;
}