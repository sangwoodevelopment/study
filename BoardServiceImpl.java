package com.multi.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//BoardDAO의 메소드 호출
//컨트롤러에서 받은 데이터를 가공해서 DAO로 넘기건나 DAO에서 받은 데이터를 가공해서 컨트롤러로 넘기는 작업
//비지니스로직
//트랜잭션처리
@Service
public class BoardServiceImpl implements BoardService {
	private BoardDAO dao;
	@Autowired
	public BoardServiceImpl(BoardDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int insert(BoardDTO board) {
		// TODO Auto-generated method stub
		return dao.insert(board);
	}

	@Override
	public List<BoardDTO> boardList() {
		// TODO Auto-generated method stub
		System.out.println("boardService");
		List<BoardDTO> boardlist = dao.boardList();
		return boardlist;
	}

	@Override
	public BoardDTO getBoardInfo(String board_no) {
		// TODO Auto-generated method stub
		return dao.read(board_no);
	}

	@Override
	public int update(BoardDTO board) {
		// TODO Auto-generated method stub
		return dao.update(board);
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return dao.delete(board_no);
	}

	@Override
	public List<BoardDTO> search(String data) {
		// TODO Auto-generated method stub
		return dao.search(data);
	}

	@Override
	public List<BoardDTO> search(String tag, String data) {
		// TODO Auto-generated method stub
		return dao.search(tag, data);
	}

	@Override
	public List<BoardDTO> findByCategory(String category) {
		// TODO Auto-generated method stub
		List<BoardDTO> list = null;
		if(category!=null) {
			if(category.equals("all")) {
				list=dao.boardList();
			}else {
				list = dao.findByCategory(category);
			}
		}
		return list;
	}

}
