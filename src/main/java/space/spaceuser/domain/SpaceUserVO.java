package space.spaceuser.domain;

import java.util.List;

import space.auction.domain.AuctionVO;
import space.board.domain.BoardVO;
import space.complain.domain.ComplainVO;
import space.point.domain.PointVO;
<<<<<<< HEAD
import space.product.domain.ProductVO;
=======
>>>>>>> 175eb7e4c00554270e0ea97a7414e5bd672c58d7
import space.review.domain.ReviewVO;

public class SpaceUserVO {
	private String id;
	private String password;
	private String tel;
	private String name;
	private String address;
	private PointVO pointVO;
	private AuctionVO auctionVO;
	private List<ProductVO> pList;
	private String crn; //�궗�뾽�옄�벑濡앸쾲�샇
	private List<BoardVO> bList;
	private List<ComplainVO> cList;
	private List<ReviewVO> rList;
	
	public SpaceUserVO() {
		super();
	}

	public SpaceUserVO(String id, String password, String tel, String name, String address, PointVO pointVO,
			AuctionVO auctionVO, List<ProductVO> pList, String crn, List<BoardVO> bList, List<ComplainVO> cList,
			List<ReviewVO> rList) {
		super();
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.name = name;
		this.address = address;
		this.pointVO = pointVO;
		this.auctionVO = auctionVO;
		this.pList = pList;
		this.crn = crn;
		this.bList = bList;
		this.cList = cList;
		this.rList = rList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PointVO getPointVO() {
		return pointVO;
	}

	public void setPointVO(PointVO pointVO) {
		this.pointVO = pointVO;
	}

	public AuctionVO getAuctionVO() {
		return auctionVO;
	}

	public void setAuctionVO(AuctionVO auctionVO) {
		this.auctionVO = auctionVO;
	}

	public List<ProductVO> getpList() {
		return pList;
	}

	public void setpList(List<ProductVO> pList) {
		this.pList = pList;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public List<BoardVO> getbList() {
		return bList;
	}

	public void setbList(List<BoardVO> bList) {
		this.bList = bList;
	}

	public List<ComplainVO> getcList() {
		return cList;
	}

	public void setcList(List<ComplainVO> cList) {
		this.cList = cList;
	}

	public List<ReviewVO> getrList() {
		return rList;
	}

	public void setrList(List<ReviewVO> rList) {
		this.rList = rList;
	}

	@Override
	public String toString() {
		return "SpaceUserVO [id=" + id + ", password=" + password + ", tel=" + tel + ", name=" + name + ", address="
				+ address + ", crn=" + crn + "]";
	}

	
}
