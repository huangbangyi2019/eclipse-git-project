package com.nnxy.team4;

import java.util.List;

public class Michael {

	private int pageIndex;
	private int pageSize;
	
	/**
	 * �@ȡ�Ñ��б�
	 * @param pageIndex, �~̖
	 * @param PageSize, ÿ퓴�С
	 * @return
	 */
	public List<Object> fetchUsers(int pageIndex, int PageSize) {
		//�Ĕ�����@ȡ�Ñ��б�
		System.out.println("�@ȡ�Ñ��б�");
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
