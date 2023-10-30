package org.zerock.myapp.service;

import org.zerock.myapp.domain.StoreVO;

import java.util.List;

public interface ProductService {

    // 카테고리 목록 조회
    public abstract List<StoreVO> findKategorieList();

    // 특정 카테고리에 속한 제품 목록 조회
    public abstract List<StoreVO> findProductList(Long kategorieId);

    // 특정 제품 상세 정보 조회
    public abstract StoreVO findProduct(Long id);

    // 새로운 제품 추가
    public abstract Integer insertProduct(StoreVO product);

    // 기존 제품 정보 업데이트
    public abstract Integer updateProduct(StoreVO product);

    // 특정 제품 삭제
    public abstract Integer deleteProduct(Long id);

} // end interface
