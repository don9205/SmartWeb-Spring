package kr.green.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDao;
import kr.green.spring.vo.BoardVo;

@Service
public class BoardServiceImp implements BoardService {
	
	@Autowired
	private BoardDao boardDao;

	@Override
	public boolean boardup(BoardVo boardVo) {
		// TODO Auto-generated method stub
		
		boardDao.insertBoard(boardVo);
		
		return true;
	}

	@Override
	public boolean write(BoardVo boardVo) {
		
		boardDao.insertBoard(boardVo);
		
		return true;
	}

	@Override
	public List<BoardVo> getBoards() {
		// TODO Auto-generated method stub
			
		return boardDao.getBoards();
	}

}
