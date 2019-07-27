package com.gura.spring02.friend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.friend.service.FriendService;

/*	[요청명]
 *  /member/list.do
 *  /member/insertform.do
 *  /member/insert.do
 *  /member/updateform.do
 *  /member/update.do
 *  /member/delete.do
 *  [view page]
 *  /member/list.jsp
 *  /member/insertform.jsp
 *  /member/insert.jsp
 *  /member/updateform.jsp
 *  /member/update.jsp
 *  /member/delete.jsp
 */

@Controller
public class FriendController {
	//의존객체 주입 받기
	@Autowired
	private FriendService friendService;
	
	@RequestMapping("/friend/list") //어떤요청에대해서
	public ModelAndView list(ModelAndView mView) {
		//어떤 서비스  이용해서 어떤 비즈니스로직 수행하고
		friendService.getList(mView);
		//view page 정보를 ModelAndView 객체에 담고
		mView.setViewName("friend/list");
		//ModelAndView 어떤 객체를 리턴해준다.
		return mView;
		
	}
	
}
