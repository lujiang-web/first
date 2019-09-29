package cn.yunhe.bean;

import java.util.Date;

public class Items {
	private int id;
	private String itemsName;
	private double itemsPrice;
	private Date itemsDate;
	
	public Items() {};
	public Items(int id, String itemsName, double itemsPrice, Date itemsDate) {
		super();
		this.id = id;
		this.itemsName = itemsName;
		this.itemsPrice = itemsPrice;
		this.itemsDate = itemsDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemsName() {
		return itemsName;
	}
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}
	public double getItemsPrice() {
		return itemsPrice;
	}
	public void setItemsPrice(double itemsPrice) {
		this.itemsPrice = itemsPrice;
	}
	public Date getItemsDate() {
		return itemsDate;
	}
	public void setItemsDate(Date itemsDate) {
		this.itemsDate = itemsDate;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemsName=" + itemsName + ", itemsPrice=" + itemsPrice + ", itemsDate="
				+ itemsDate + "]";
	};
	
	
}
