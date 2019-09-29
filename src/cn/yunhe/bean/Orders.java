package cn.yunhe.bean;

import java.util.Date;

public class Orders {
	private int order_id;
	private int users_id;
	private int order_number;
	private Date order_time;
	private Items itemslist;
	
	public Orders() {}
	
	public Orders(int order_id, int users_id, int order_number, Date order_time, Users users) {
		super();
		this.order_id = order_id;
		this.users_id = users_id;
		this.order_number = order_number;
		this.order_time = order_time;
		
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	public int getOrder_number() {
		return order_number;
	}
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}

	public Items getItemslist() {
		return itemslist;
	}

	public void setItemslist(Items itemslist) {
		this.itemslist = itemslist;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", users_id=" + users_id + ", order_number=" + order_number
				+ ", order_time=" + order_time + ", itemslist=" + itemslist + "]";
	}
	

	
}
