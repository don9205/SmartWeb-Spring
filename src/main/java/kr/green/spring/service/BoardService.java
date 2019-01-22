package kr.green.spring.service;

import java.util.List;

import kr.green.spring.vo.BoardVo;

public interface BoardService {
	
	public boolean boardup(BoardVo boardVo);

	public boolean write(BoardVo boardVo);
	
	public List<BoardVo> getBoards();

}
