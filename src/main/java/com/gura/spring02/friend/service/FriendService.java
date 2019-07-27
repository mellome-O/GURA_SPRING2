package com.gura.spring02.friend.service;

import org.springframework.web.servlet.ModelAndView;

public interface FriendService {
	//친구 목록을 얻어와서 ModelAndView 객체에 담아주는 메소드
	public void getList(ModelAndView mView);
	
}
