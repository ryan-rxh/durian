package com.durian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durian.dao.IItemDao;
import com.durian.domain.Item;
import com.durian.service.IItemService;
import com.durian.utils.Page;

@Service("itemService")
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemDao itemDao;
	
	@Override
	public Item addItem(Item item) {
		return itemDao.addItem(item);
	}

	@Override
	public void deleteItem(Item item) {
		itemDao.deleteItem(item);
	}

	@Override
	public void deleteItemByBillId(int billId) {
		itemDao.deleteItemByBillId(billId);
	}

	@Override
	public void updateItem(Item item) {
		itemDao.updateItem(item);
	}

	@Override
	public List<Item> getItemListByBillId(int billId) {
		return itemDao.getItemListByBillId(billId);
	}

	@Override
	public List<Item> getItemListByBillId(int billId, Page page) {
		return itemDao.getItemListByBillId(billId, page);
	}

}
