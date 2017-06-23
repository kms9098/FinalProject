package space.spaceuser.model.impl;

import java.util.List;

import space.deal.domain.DealVO;
import space.point.domain.PointVO;
import space.spaceuser.domain.SpaceUserVO;

public class SpaceUserServiceImpl implements SpaceUserService{

	@Override
	public void registerUser(SpaceUserVO spaceUserVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SpaceUserVO login(SpaceUserVO spaceUserVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(SpaceUserVO spaceUserVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findId(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPassword(String id, String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpaceUserVO getUserInfo(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void upgradeUserGrade(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PointVO> getAllTransactionInfo(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DealVO> getAllDealList(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DealVO getDealInfo(int dNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fillPoint(SpaceUserVO spaceUserVO, PointVO pointVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refundPoint(String id, int balance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PointVO getPoint(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
