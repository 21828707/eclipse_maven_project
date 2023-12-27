package dao;

import java.util.List;

import vo.Message;

public interface MessageDAO {

	int selectCount();
	List<Message> selectList(int page, int pageSize);
	void insert(Message message);
}
