package service;

import vo.ListResult;

public interface GuestBookListService {

	ListResult getMessage(int page, int pageSize);

}
