package space.auction.model.impl;

import java.util.List;

import space.auction.domain.AuctionVO;
import space.bid.domain.BidVO;

public interface AuctionService {
	public void applyAuction(AuctionVO auctionVO) throws Exception;
	public void deleteAuction(String id) throws Exception;
	public void updateAuction(AuctionVO auctionVO) throws Exception;
	public void acceptAuction(String id) throws Exception;
	public List<AuctionVO> getAllAuction() throws Exception;
	public AuctionVO getAuction(AuctionVO auctionVO) throws Exception;
	public BidVO updateBidCount(BidVO bidVO) throws Exception;
	public String getBidCount(String id) throws Exception;
}
