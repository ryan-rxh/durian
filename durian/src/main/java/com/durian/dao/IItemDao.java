package com.durian.dao;

import java.util.List;

import com.durian.domain.Item;
import com.durian.utils.Page;

public interface IItemDao {
	public Item addItem(Item item);
	public void deleteItem(Item item);
	public void deleteItemByBillId(int billId);
	public void updateItem(Item item);
	public List<Item> getItemListByBillId(int billId);
	public List<Item> getItemListByBillId(int billId, Page page);
}
