package space.product.model.impl;

import java.util.List;

import space.hashtag.domain.HashtagVO;
import space.product.domain.ProductVO;
import space.spaceuser.domain.SpaceUserVO;

public interface ProductService {
	void registerProduct(ProductVO productVO)throws Exception;
	void reserveProduct(String id, String pNo)throws Exception;
	ProductVO getProductInfo(ProductVO productVO)throws Exception;
	List<ProductVO> getAllProductInfo(ProductVO productVO)throws Exception;
	void updateProduct(ProductVO productVO)throws Exception;
	void deleteProduct(SpaceUserVO spaceUserVO)throws Exception;
	List<HashtagVO> searchProduct(String keyword)throws Exception;
}
