package com.gura.spring02;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller //Controller를 만들기 위한 어노테이션
public class HomeController {
	
/*	1. HttpServletRequest
	@RequestMapping("/home") //home.do 로 끝나는 요청 (.do는 생략가능)
	public String home(HttpServletRequest req) {
		//view page에 전달한 model 이라고 가정하자
		List<String> notice = new ArrayList<String>();
		notice.add("장마철입니다.");
		notice.add("우산을 잘 챙기세요.");
		notice.add("어쩌구...");
		notice.add("저쩌구...");
		
		
		//view 페이지에 전달할 모델을 req에 담음 
		//req에 "notice"라는 키값으로 담는다.
		req.setAttribute("notice",notice);
		
		//WEB-INF/views/home.jsp 뷰페이지로 forward 이동해서 응답
		//prefix와 			suffix 빠진 것
		return "home";
	}
*/
	
	//2.ModelAndView
	@RequestMapping("/home")
	public ModelAndView home2(ModelAndView mView) {
		
		List<String> notice = new ArrayList<String>();
		notice.add("장마철입니다.");
		notice.add("우산을 잘 챙기세요.");
		notice.add("어쩌구...");
		notice.add("저쩌구...");
		
		//model객체는 2가지 (model과 view페이지정보설정)를 담을 수 있다 
		mView.addObject("notice", notice);
		mView.setViewName("home");
		
		return mView;
	}
	
	
}
