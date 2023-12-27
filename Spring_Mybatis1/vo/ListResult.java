package vo;

import java.util.List;

public class ListResult {
	private int page;
	private int totalCount;
	private int pageSize;
	private List<Message> message;
	private int totalPageCount;
	public ListResult(int page, int totalCount, int pageSize, List<Message> message) {
		super();
		this.page = page;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.message = message;
		this.totalPageCount = calculateTotalPageCount();
	}
	private int calculateTotalPageCount() {
		// TODO Auto-generated method stub
		int pageCount = totalCount / pageSize + ((totalCount % pageSize == 0)?0:1);
		
		return pageCount;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Message> getMessage() {
		return message;
	}
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
}
