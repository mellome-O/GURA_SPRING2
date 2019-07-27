package com.gura.spring02.friend.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gura.spring02.friend.dto.FriendDto;

@Repository
//구현클래스 implements
//의존관계 느슨하게 하기 위해 인터페이스 이용
public class FriendDaoImpl implements FriendDao{

	//의존객체 주입 (DI)받기 핵심객체 직접 생성하지않고 가져다쓰기
	@Autowired //스프링빈컨테이너에서 관리하고 있는 객체 타입 가져온 것
	private SqlSession session;
	@Override
	public void insert(FriendDto dto) {
		//mapper.xml의 namespace =>friend
		//해당 mapper 안에 있는 sql 의 id => insert
		//ParameterType => FriendDto
		session.insert("friend.insert",dto);
			//("mapper의 namespace.sql의id", 메소드파라미터타입)
	}

	@Override
	public void update(FriendDto dto) {
		session.update("friend.update",dto);
	}

	@Override
	public void delete(int num) {
		session.delete("friend.delete",num);

	}

	//회원 한 명의 정보를 select해서 리턴하는 메소드
	@Override
	public FriendDto getData(int num) {
		/*
		mapper namespace=friend
		sql id= getData
		parameterType = int
		result type = FriendDto
		*/
		
		FriendDto dto = session.selectOne("friend.getData", num);
		//result type
		//select One에서는 받고싶은 데이터타입을 result type에 명시
		
		//mybatis가 setter메소드호출해서 객체생성하고 알아서 포장해줌
		//selectOne에서는 return할 타입  하나의 row 타입정하기
		//-> 내가 의도한 데이터타입 ->반환 타입이 동적이다
		
		return dto;
	}

	@Override
	public List<FriendDto> getList() {
		//row가 여러개 일 때
		//result type에 E -->result type은 고정, 제너릭타입은 동적 --> Dto
		//리턴되는 데이터타입은 List로 고정되어있지만 
		//받고싶은 제너릭 타입을 결정할 수 있다, 어떤 목록 가져올 건지 결정
		//List<받고싶은제너릭타입결정>
		List<FriendDto> list = session.selectList("friend.getList");
		//("friend.getList") parameterType있으면 괄호안에 써주면 됨
		return list;
	}

}
