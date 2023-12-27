package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MessageDAO;
import vo.Message;
@Service
public class GuestBookWriteServiceImpl implements GuestBookWriteService {

	@Autowired
	private MessageDAO messageDAO;
	
	@Override
	public void write(Message message) {
		// TODO Auto-generated method stub
		messageDAO.insert(message);
	}

}
