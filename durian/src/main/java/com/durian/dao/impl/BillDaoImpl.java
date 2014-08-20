package com.durian.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.durian.dao.IBillDao;
import com.durian.domain.Bill;
import com.durian.utils.Page;

@Repository
public class BillDaoImpl extends AbstractDao implements IBillDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Bill> getBillListByUserId(String userId, Page page) {
		
		List<Long> sizeList = hibernateTemplate.find("select count(*) from Bill where user.userId=?", userId);
		long totalCount = 0;
		if(sizeList != null && sizeList.size() > 0 ){
			totalCount = sizeList.get(0);
		}
		DetachedCriteria dc = DetachedCriteria.forClass(Bill.class);
		dc.add(Restrictions.eq("user.userId", userId));
		List<Bill> billList = hibernateTemplate.findByCriteria(dc, page.getFirstResultIndex(), page.getPageSize());
		
		page.setTotalCount(totalCount);
		page.setData(billList);
		
		return billList;
	}

	@Override
	public List<Bill> getBillListByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBill(Bill bill) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBill(Bill bill) {
		// TODO Auto-generated method stub

	}

	@Override
	public Bill addBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

}
