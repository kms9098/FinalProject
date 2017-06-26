package test;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import space.complain.domain.ComplainVO;
import space.deal.domain.DealVO;
import space.point.domain.PointVO;
import space.product.domain.ProductVO;
import space.spaceuser.domain.SpaceUserVO;

/*
 *  JUnit 을 이용해서 MyBatis Framework 단위테스트를 한다.
 */
public class MyBatisJUnitTest2 {
	@Test
	public void jTest() throws Exception{
		Reader r=Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(r);
		SqlSession session =  factory.openSession();
		
		//SpaceUserVO vo = new SpaceUserVO("aaa", "1234", "01041829097", "강민성", "성남", "1111");
		//session.insert("userMapper.registerUser",vo);
		//session.update("userMapper.updateUser", vo);
		//System.out.println(session.selectOne("userMapper.loginUser", vo));
		//System.out.println(session.selectOne("userMapper.getUserInfo", "minseong"));
		//System.out.println(session.selectOne("userMapper.findPassword", vo));
		//PointVO vo = new PointVO("minseong", "1000000", "1000000", "1000000");
		//DealVO dvo = new DealVO(dNo, id, pNo, price, resDate, resTime, bTel, sTel, title, area, grade, accept)
		//session.insert("userMapper.fillPoint", vo);
		//session.update("userMapper.upgradeUserGrade","aaa");
		//System.out.println(session.selectList("userMapper.getAllTransactionInfo", "aaa"));
		//System.out.println(session.selectList("userMapper.getPoint","aaa"));
		//PointVO pvo = new PointVO();
		//pvo.setBalance("10000");
		//vo.setPointVO(pvo);
		//session.update("userMapper.updatePay",vo);
		/*ComplainVO vo = new ComplainVO();
		
		vo.setId("aaa");
		vo.setContent("abc");
		
		vo.setTitle("aaaaaaaa");
		vo.setpNo(3); */
		//session.insert("complainMapper.complainProduct", vo);
		//System.out.println(session.selectOne("complainMapper.getComplain", 1));
		
		//System.out.println(session.selectList("complainMapper.getAllComplain", vo ));
		//System.out.println(session.selectList("complainMapper.findComplainById","aaa"));
		
		//searchProductByCondition
		ProductVO vo1 = new ProductVO();
		
		vo1.setType("1");
		vo1.setArea("444");
		ProductVO vo2 = new ProductVO();
		
		vo2.setType("1");
		
		System.out.println(session.selectList("productMapper.searchProductByCondition", vo2));
		session.commit();

	}
}













