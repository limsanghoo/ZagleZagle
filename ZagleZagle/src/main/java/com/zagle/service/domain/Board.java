package com.zagle.service.domain;

import java.sql.Date;

public class Board {
	
	///Field
	private String boardNo;
	private User user;
	private String boardDetailText;
	private String hashTag;
	private String userTheme;
	private Date boardRegDate;
	private String photo1;
	private String photo2;
	private String photo3;
	private String address;
	private String coord;
	private String boardStatus;
	private int likeCount;
	
	public Board() {	
	}

	public String getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBoardDetailText() {
		return boardDetailText;
	}

	public void setBoardDetailText(String boardDetailText) {
		this.boardDetailText = boardDetailText;
	}

	public String getHashTag() {
		return hashTag;
	}

	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}

	public String getUserTheme() {
		return userTheme;
	}

	public void setUserTheme(String userTheme) {
		this.userTheme = userTheme;
	}

	public Date getBoardRegDate() {
		return boardRegDate;
	}

	public void setBoardRegDate(Date boardRegDate) {
		this.boardRegDate = boardRegDate;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public String getPhoto3() {
		return photo3;
	}

	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCoord() {
		return coord;
	}

	public void setCoord(String coord) {
		this.coord = coord;
	}

	public String getBoardStatus() {
		return boardStatus;
	}

	public void setBoardStatus(String boardStatus) {
		this.boardStatus = boardStatus;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", User="+user
				+ ", boardDetailText=" + boardDetailText + ", hashTag=" + hashTag
				+ ", userTheme=" + userTheme + ", boardRegDate=" + boardRegDate + ", photo1=" + photo1 + ", photo2="
				+ photo2 + ", photo3=" + photo3 + ", address=" + address + ", coord=" + coord + ", boardStatus="
				+ boardStatus + ", likeCount=" + likeCount + "]";
	}
	
	
}
