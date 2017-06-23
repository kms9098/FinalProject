package space.review.model.impl;

import java.util.List;

import space.review.domain.ReviewVO;

public interface ReviewDAO {
	public void reviewProduct(ReviewVO reviewVO)throws Exception;
	public List<ReviewVO> getAllReview()throws Exception;
}
