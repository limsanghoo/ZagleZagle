package com.zagle.service.admin;

import java.util.Map;

import com.zagle.common.Search;
import com.zagle.service.domain.Report;

public interface AdminService {

	///���� ������Ʈ ���
	public Map <String, Object> listBlackObject(Search search) throws Exception;
	
	///������Ʈ ���
	public Map <String, Object> listBlackList(Search search) throws Exception;
	
	///�Ű�ó�� 
	public void updateReport(Report report) throws Exception;
	
	///ȸ�����
	public Map<String, Object> listUser(Search search) throws Exception;
	
	/// �Խù� ����ε� ���·� ����
	public void addBlind(Board board) throws Exception;
	
	/// ��� ����ε� ���·� ����
	public void addBlind2(Comment comment) throws Exception;
	
	/// �Խù� ����ε� ���� ����
	
	public void cancelBlind(Board board) throws Exception;
	
	/// ��� ����ε� ���� ����
	
	public void cancelComment(Comment comment) throws Exception;
	
	/// ����ε� �Խù� ����
	
	public void deleteBlind()
	
	
	
	
	
	
	
}
