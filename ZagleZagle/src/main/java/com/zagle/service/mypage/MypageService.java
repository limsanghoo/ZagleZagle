package com.zagle.service.mypage;

import java.util.Map;

import com.zagle.service.domain.User;

public interface MypageService {
	
	///계좌등록
	public void addAccount(User user) throws Exception;
	
	///계좌수정
	public void updateAccount(User user) throws Exception;
	
	///작성 코맨트 목록
	public Map<String, Object> listComment(Search search) throws Exception;
	
	///좋아요 누른 목록
	public Map<String, Object> listLike(Search search) throws Exception;
	
	///스크랩 게시물 목록
	public Map<String, Object> listScrap(Search search) throws Exception;
	
	///회원 계좌 본인인증
	public User getAccountCheck(User user) throws Exception;
	
	


}
