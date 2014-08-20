package com.durian.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.durian.dao.IItemDao;
import com.durian.domain.Item;
import com.durian.utils.Page;

@Repository
public class ItemDaoImpl extends AbstractDao implements IItemDao {

	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteItem(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteItemByBillId(int billId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Item> getItemListByBillId(int billId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getItemListByBillId(int billId, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

}
