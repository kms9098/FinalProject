package space.spaceuser.model.impl;

import java.util.List;

import space.deal.domain.DealVO;
import space.point.domain.PointVO;
import space.spaceuser.domain.SpaceUserVO;

public interface SpaceUserDAO {
	public void registerUser(SpaceUserVO spaceUserVO)throws Exception;
	public SpaceUserVO login(SpaceUserVO spaceUserVO)throws Exception;
	public void updateUser(SpaceUserVO spaceUserVO)throws Exception;
	public void deleteUser(String id)throws Exception;
	public String findId(String name)throws Exception;
	public String findPassword(String id, String name)throws Exception;
	public SpaceUserVO getUserInfo(String id)throws Exception;
	public void upgradeUserGrade(String id)throws Exception;
	public List<PointVO> getAllTransactionInfo(String id)throws Exception;
	public List<DealVO> getAllDealList(String id) throws Exception;
	public DealVO getDealInfo(int dNo) throws Exception;
	public void fillPoint(SpaceUserVO spaceUserVO, PointVO pointVO ) throws Exception;
	public void refundPoint(String id , int balance)throws Exception;
	public PointVO getPoint(String id)throws Exception;// 내포인트 조회
	
}
