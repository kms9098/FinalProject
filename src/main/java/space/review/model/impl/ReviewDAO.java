package space.review.model.impl;

import java.util.List;

import space.review.domain.ReviewVO;

public interface ReviewDAO {
	public void addReview(ReviewVO reviewVO)throws Exception;
	public List<ReviewVO> getAllReview() throws Exception;
	public void deleteReview(String id)throws Exception;
	public ReviewVO updateReview(ReviewVO reviewVO)throws Exception;
	public void updateGoodCount(ReviewVO reviewVO)throws Exception;
	public void GoodCountCancle(ReviewVO reviewVO)throws Exception;
}
