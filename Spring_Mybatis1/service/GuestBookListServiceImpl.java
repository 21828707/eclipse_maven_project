package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MessageDAO;
import vo.ListResult;
import vo.Message;

@Service
public class GuestBookListServiceImpl implements GuestBookListService {

	@Autowired
	private MessageDAO messageDAO;
	
	@Override
	public ListResult getMessage(int page, int pageSize) {
		// TODO Auto-generated method stub
		int totalCount = messageDAO.selectCount();
		List<Message> messages = messageDAO.selectList(page, pageSize);
		return new ListResult(page, totalCount, pageSize, messages);
	}

}
