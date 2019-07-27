package com.gura.spring02.friend.dto;
//회원 한 명의 정보를 담을 Dto 클래스 정의하기 
public class FriendDto {
	private int num;
	private String name;
	private String addr;
	
	public FriendDto() {
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
