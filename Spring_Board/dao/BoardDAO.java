package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import vo.Board;

@Repository
public class BoardDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Board> selectBoardList() {
		// TODO Auto-generated method stub
		String sql = "select * from board order by seq desc";

		// 데이터베이스의 레코드를 객체로 매핑하는 인터페이스.
		RowMapper<Board> mapper = new RowMapper<Board>() {

			@Override
			public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Board board = new Board();
				board.setContent(rs.getString("content"));
				board.setHitCount(rs.getInt("hitcount"));
				board.setRegdate(rs.getString("regdate"));
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				return board;
			}
		};

		List<Board> boardList = jdbcTemplate.query(sql, mapper);
		return boardList;
	}

	public void insertArticle(Board board) {
		// TODO Auto-generated method stub
		String sql = "insert into board(seq, title, content, writer, regdate, hitcount)"
				+ " values(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		// oracle은 sysdate

		Object[] values = new Object[] { board.getTitle(), board.getContent(), board.getWriter(), };

		jdbcTemplate.update(sql, values);
	}

	public Board selectBoard(int seq) {
		// TODO Auto-generated method stub
		String sql = "select * from board where seq = ?";
		Object[] values = new Object[] { seq };

		RowMapper<Board> mapper = new RowMapper<Board>() {

			@Override
			public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Board board = new Board();
				board.setContent(rs.getString("content"));
				board.setHitCount(rs.getInt("hitcount"));
				board.setRegdate(rs.getString("regdate"));
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				return board;
			}
		};

		Board board = jdbcTemplate.queryForObject(sql, values, mapper);
		
		return board;
	}

	public Board selectOldBoard(int seq) {
		// TODO Auto-generated method stub
		String sql = "select * from board where seq = ?";
		Object[] values = new Object[] { seq };

		RowMapper<Board> mapper = new RowMapper<Board>() {

			@Override
			public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Board board = new Board();
				board.setContent(rs.getString("content"));
				board.setHitCount(rs.getInt("hitcount"));
				board.setRegdate(rs.getString("regdate"));
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				return board;
			}
		};

		Board board = jdbcTemplate.queryForObject(sql, values, mapper);
		
		return board;
	}

	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		String sql = "update board set writer = ?, title = ?, content = ? where seq = ?";
		Object[] values = new Object[] {
				board.getWriter(),
				board.getTitle(),
				board.getContent(),
				board.getSeq()
		};
		
		jdbcTemplate.update(sql, values);
	}

	public void deleteBoard(int seq) {
		// TODO Auto-generated method stub
		String sql = "delete board where seq = ?";
		
		Object[] values = new Object[] {seq};
		
		jdbcTemplate.update(sql, values);
	}

}
