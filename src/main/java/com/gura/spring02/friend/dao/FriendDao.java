package com.gura.spring02.friend.dao;

import java.util.List;

import com.gura.spring02.friend.dto.FriendDto;
//테이블 당 dao,dto 하나가 아님  1:1 관계가 아님
//카테고리(주제)와 dao, dto 가 1:1


public interface FriendDao {
	//회원 한 명의 정보를 추가하는 메소드의 형태 정의
	public void insert(FriendDto dto);
	//회원 한 명의 정보를 수정하는 메소드
	public void update(FriendDto dto);
	//회원 한 명의 정보를 삭제하는 메소드
	public void delete(int num); //삭제하는 데 필요한 프라이머리 키 
	//회원 한 명의 정보를 리턴하는 메소드
	public FriendDto getData(int num);
	//회원 목록을 리턴하는 메소드
	public List<FriendDto> getList();
	

}
