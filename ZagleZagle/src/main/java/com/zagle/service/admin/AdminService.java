package com.zagle.service.admin;

import java.util.Map;

import com.zagle.common.Search;
import com.zagle.service.domain.Report;

public interface AdminService {

	///예비 블랙리스트 목록
	public Map <String, Object> listBlackObject(Search search) throws Exception;
	
	///블랙리스트 목록
	public Map <String, Object> listBlackList(Search search) throws Exception;
	
	///신고처리 
	public void updateReport(Report report) throws Exception;
	
	///회원목록
	public Map<String, Object> listUser(Search search) throws Exception;
	
	/// 게시물 블라인드 상태로 변경
	public void addBlind(Board board) throws Exception;
	
	/// 댓글 블라인드 상태로 변경
	public void addBlind2(Comment comment) throws Exception;
	
	/// 게시물 블라인드 상태 해지
	
	public void cancelBlind(Board board) throws Exception;
	
	/// 댓글 블라인드 상태 해지
	
	public void cancelComment(Comment comment) throws Exception;
	
	/// 블라인드 게시물 삭제
	
	public void deleteBlind()
	
	
	
	
	
	
	
}
