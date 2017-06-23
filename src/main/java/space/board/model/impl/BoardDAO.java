package space.board.model.impl;

import java.util.List;

import space.board.domain.BoardVO;

public interface BoardDAO {
	public List searchFAQ(String category, String word) throws Exception;	// word로 title 과 content 둘다 검색한다.
	public BoardVO getFAQInfo(String bNo) throws Exception;
	public List getAllFAQInfo() throws Exception;
	public BoardVO getNotice(String bNo) throws Exception;
	public List getAllNotice() throws Exception;
	public List searchNotice(String word) throws Exception;	// word로 title 과 content 둘다 검색한다.
	
}
