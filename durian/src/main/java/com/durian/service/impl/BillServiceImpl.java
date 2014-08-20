package com.durian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durian.dao.IBillDao;
import com.durian.domain.Bill;
import com.durian.service.IBillService;
import com.durian.utils.Page;

@Service("billSrevice")
public class BillServiceImpl implements IBillService {

	@Autowired
	private IBillDao billDao;
	
	@Override
	public List<Bill> getBillListByUserId(String userId, Page page) {
		return billDao.getBillListByUserId(userId, page);
	}

	@Override
	public List<Bill> getBillListByUserId(String userId) {
		return billDao.getBillListByUserId(userId);
	}

	@Override
	public void deleteBill(Bill bill) {
		billDao.deleteBill(bill);
	}

	@Override
	public void updateBill(Bill bill) {
		billDao.updateBill(bill);
	}

	@Override
	public Bill addBill(Bill bill) {
		return billDao.addBill(bill);
	}

}
