package com.durian.dao;

import java.util.List;

import com.durian.domain.Bill;
import com.durian.utils.Page;

public interface IBillDao {
	public List<Bill> getBillListByUserId(String userId, Page page);
	public List<Bill> getBillListByUserId(String userId);
	public void deleteBill(Bill bill);
	public void updateBill(Bill bill);
	public Bill addBill(Bill bill);
}
