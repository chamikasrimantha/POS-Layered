/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import supermarketlayered.dao.DaoFactory;
import supermarketlayered.dao.customer.ItemDao;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.entity.ItemEntity;
import supermarketlayered.service.custom.ItemService;
/**
 *
 * @author HP
 */
public class ItemServiceImpl implements ItemService {
    
    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    
    @Override
    public String addItem(ItemDto dto) throws Exception {
        Boolean resp = itemDao.add(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(), dto.getQty()));
        return resp ? "Success" : "Fail";
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
        Boolean resp = itemDao.update(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(), dto.getQty()));
        return resp ? "Success" : "Fail";
    }

    @Override
    public String deleteItem(String id) throws Exception {
        Boolean resp = itemDao.delete(id);
        return resp ? "Success" : "Fail";
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
        ItemEntity entity = itemDao.get(id);
        return new ItemDto(entity.getId(),
                entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQty());
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        
        List<ItemEntity> itemEntitys = itemDao.getAll();
        
        for (ItemEntity entity : itemEntitys) {
            ItemDto itemDto = new ItemDto(entity.getId(), entity.getDescription(),
                entity.getPackSize(), entity.getUnitPrice(), entity.getQty());
            itemDtos.add(itemDto);
        }
        
        return itemDtos;
    }

    
    
}