package space.spaceuser.model.impl;

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
	
}
