package cn.yunhe.bean;

import java.util.List;

public class OrderDetail {
	private int id;
	private int orders_id;
	private int  items_id;
	private int items_num;
	private List<Items> itemslist;
	public OrderDetail() {}
	public OrderDetail(int id, int orders_id, int items_id, int items_num) {
		super();
		this.id = id;
		this.orders_id = orders_id;
		this.items_id = items_id;
		this.items_num = items_num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public int getItems_id() {
		return items_id;
	}
	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}
	public int getItems_num() {
		return items_num;
	}
	public void setItems_num(int items_num) {
		this.items_num = items_num;
	}
	
	public List<Items> getItemslist() {
		return itemslist;
	}
	public void setItemslist(List<Items> itemslist) {
		this.itemslist = itemslist;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orders_id=" + orders_id + ", items_id=" + items_id + ", items_num="
				+ items_num + ", itemslist=" + itemslist + "]";
	}
	
}
