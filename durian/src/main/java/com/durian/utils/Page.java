package com.durian.utils;

import java.util.List;

public class Page {
	private static int DEFAULT_PAGE_SIZE = 20;
	private int pageSize = DEFAULT_PAGE_SIZE;
	private int currentPageNo;
	private long totalCount;
	private List<?> data;

	public Page(int currentPageNo){
		this(currentPageNo, DEFAULT_PAGE_SIZE);
	}
	
	public Page(int currentPageNo, int pageSize){
		this.currentPageNo = currentPageNo;
		this.pageSize = pageSize;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public long getTotalPageCount(){
		return (totalCount % pageSize == 0)? (totalCount / pageSize): (totalCount / pageSize + 1);
	}
	
	public int getFirstResultIndex() {
		return (currentPageNo - 1) * pageSize;
	}
	
	public boolean hasNextPage(){
		if(currentPageNo < getTotalPageCount()){
			return true;
		}
		return false;
	}
	
	public boolean hasPreviousPage(){
		if(currentPageNo == 1){
			return false;
		}
		return true;
	}
}
