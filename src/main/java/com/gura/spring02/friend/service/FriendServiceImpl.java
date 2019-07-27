package com.gura.spring02.friend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.friend.dao.FriendDao;
import com.gura.spring02.friend.dto.FriendDto;

@Service
public class FriendServiceImpl implements FriendService{
	//의존객체 주입받기
	@Autowired
	//private FriendDaoImpl friendDao; //이렇게 직접 의존하지말고 
	private FriendDao friendDao;//의존객체는 interface타입으로 주입해야함
	
	@Override
	public void getList(ModelAndView mView) {
		
		// <비즈니스 로직>
		//친구 목록을 얻어와서 
		List<FriendDto> list = friendDao.getList();
		System.out.println(list.size());
		//ModelAndView 객체에 담는다
		mView.addObject("list",list);
	}

}
