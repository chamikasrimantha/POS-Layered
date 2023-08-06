/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dto;

/**
 *
 * @author HP
 */
public class ItemDto {
    private String id;
    private String description;
    private String packSize;
    private Double unitPrice;
    private Integer qty;

    public ItemDto() {
    }

    public ItemDto(String id, String description, String packSize, Double unitPrice, Integer qty) {
        this.id = id;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qty = qty;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "id=" + id + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qty=" + qty + '}';
    }
    
    
}
