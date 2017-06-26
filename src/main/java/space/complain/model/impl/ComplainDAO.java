package space.complain.model.impl;

import java.util.List;

import space.complain.domain.ComplainVO;

public interface ComplainDAO {
	public void complainProduct(ComplainVO complainVO)throws Exception;
	//상품 신고
	public ComplainVO getComplain(int cNo)throws Exception;
	//상세 신고글 조회
	public List<ComplainVO> getAllComplain()throws Exception;
	//전체 신고글 조회
	public List<ComplainVO> findComplainById(String id)throws Exception;
	//특정회원 신고글 검색
}
