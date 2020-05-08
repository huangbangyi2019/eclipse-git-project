package com.nnxy.team4;

import java.util.List;

public class Michael {

	private int pageIndex;
	private int pageSize;
	
	/**
	 * 獲取用戶列表
	 * @param pageIndex, 葉號
	 * @param PageSize, 每頁大小
	 * @return
	 */
	public List<Object> fetchUsers(int pageIndex, int PageSize) {
		//從數據庫獲取用戶列表
		System.out.println("獲取用戶列表");
		return null;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
