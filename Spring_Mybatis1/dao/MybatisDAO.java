package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vo.Message;

@Service
public class MybatisDAO implements MessageDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("guestbook.selectCount");
	}

	@Override
	public List<Message> selectList(int page, int pageSize) {
		// TODO Auto-generated method stub
		int startRow = (page - 1) * pageSize + 1;
		int endRow = startRow + pageSize - 1;
		
		Map<String, Integer> params = new HashMap<String, Integer>();
		
		params.put("startRow", startRow);
		params.put("endRow", endRow);
		return sqlSessionTemplate.selectList("guestbook.selectList", params);
	}

	@Override
	public void insert(Message message) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert("guestbook.insert", message);
	}

}
