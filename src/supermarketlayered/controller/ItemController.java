/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.controller;

import java.util.List;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.service.ServiceFactory;
import supermarketlayered.service.custom.ItemService;
/**
 *
 * @author HP
 */
public class ItemController {
    
    ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);

    public String addItem(ItemDto itemDto) throws Exception {
        return itemService.addItem(itemDto);
    }

    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
    }

    public String deleteItem(String id) throws Exception {
        return itemService.deleteItem(id);
    }

    public ItemDto getItem(String ItemId) throws Exception {
        return itemService.getItem(ItemId);
    }
    
    public List<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItem();
    }
}