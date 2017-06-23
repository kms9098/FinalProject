package space.board.model.impl;

import java.util.List;

import space.board.domain.BoardVO;

public interface BoardService {
	/** FAQ 검색 */
	public List searchFAQ(String category, String word) throws Exception;	// word로 title 과 content 둘다 검색한다.
	/** 특정 FAQ 조회 */
	public BoardVO getFAQInfo(String bNo) throws Exception;
	/** 전체 FAQ 조회 */
	public List getAllFAQInfo() throws Exception;
	/** 특정 공지사항 조회 */
	public BoardVO getNotice(String bNo) throws Exception;
	/** 전체 공지사항 조회 */
	public List getAllNotice() throws Exception;
	/** 공지사항 검색 */
	public List searchNotice(String word) throws Exception;	// word로 title 과 content 둘다 검색한다.
	
}
