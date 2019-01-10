package com.zagle.service.mypage;

import java.util.Map;

import com.zagle.service.domain.User;

public interface MypageService {
	
	///���µ��
	public void addAccount(User user) throws Exception;
	
	///���¼���
	public void updateAccount(User user) throws Exception;
	
	///�ۼ� �ڸ�Ʈ ���
	public Map<String, Object> listComment(Search search) throws Exception;
	
	///���ƿ� ���� ���
	public Map<String, Object> listLike(Search search) throws Exception;
	
	///��ũ�� �Խù� ���
	public Map<String, Object> listScrap(Search search) throws Exception;
	
	///ȸ�� ���� ��������
	public User getAccountCheck(User user) throws Exception;
	
	


}
