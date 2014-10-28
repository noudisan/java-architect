package com.ztt.query;


/**
 * datatables 页面查询参数
 * http://www.datatables.net/usage/server-side
 * Parameters sent to the server
 */
public class DtRequest {

	// 当前起始记录数
	private int iDisplayStart = 0;
	// 每一页显示条数
	private int iDisplayLength = 10;
	//默认查询框内容
	private String sSearch;
	// sEcho
	private int sEcho;
	
	public int getiDisplayStart() {
		return iDisplayStart;
	}
	public void setiDisplayStart(int iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}
	public int getiDisplayLength() {
		return iDisplayLength;
	}
	public void setiDisplayLength(int iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}
	public int getsEcho() {
		return sEcho;
	}
	public void setsEcho(int sEcho) {
		this.sEcho = sEcho;
	}
	public String getsSearch() {
		return sSearch;
	}
	public void setsSearch(String sSearch) {
		this.sSearch = sSearch;
	}

    public int getPageSize(){
        return  iDisplayLength;
    }
    public int getCurrentPage(){
        int currentPage = (iDisplayStart +iDisplayLength) /iDisplayLength;
        return currentPage;
    }
}
