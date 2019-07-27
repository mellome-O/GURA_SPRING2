package com.gura.spring02;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller //Controller를 만들기 위한 어노테이션
public class FortuneController {
	
	@RequestMapping("/fortune")
	public ModelAndView fortune(ModelAndView mView) {
		
		String fortuneToday="동쪽으로 가면 귀인을 만나요~";
		
		//model객체는 2가지 (model과 view페이지정보설정)를 담을 수 있다 
		mView.addObject("fortuneToday", fortuneToday);
		mView.setViewName("fortune");
		
		return mView;
	}
}
