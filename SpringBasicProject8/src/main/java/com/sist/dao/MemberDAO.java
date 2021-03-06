package com.sist.dao;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/*
 *      Model => Controller => BoardController (O)
 *      VO
 *      DAO (O)
 *      Service (O)
 *      Manager (O)
 *      ====================================== Model
 *      
 *      @Component
 *      @Repository
 *      @Service
 *      @Controller
 *      @RestController
 *      
 *      순서 (스프링 => 객체 관리 (생명주기)
 *      ====
 *        1) 메모리 할당 => 등록된 모든 클래스   =====> Map에 저장 
 *           c: <constructor-arg>
 *        2) p: <property> 확인 (DI의 존재여부 확인)
 *        3) 존재하면 => setXxx()메소드에 주입 
 *        4) 메소드 DI가 존재하는지 여부 확인 (init-method)
 *        5) 존재하면 => 메소드 호출 
 *        ==============================================
 *        6) 프로그래머가 필요한 메소드 호출(사용자 사용)
 *           => 프로그램종료 , 사이트 이동 => 컨테이너가 닫긴다
 *        ==============================================
 *        7) 메소드 존재여부 확인 (destory-method)
 *        8) 객체 소멸 
 *        
 */
@Repository
public class MemberDAO {
   @Autowired
   private MemberMapper mapper;
   
   public List<MemberVO> memberAllData()
   {
	   return mapper.memberAllData();
   }
   
   public MemberVO memberDetailData(int no)
   {
	   return mapper.memberDetailData(no);
   }
   
   public void memberInsert(MemberVO vo)
   {
	   mapper.memberInsert(vo);
   }
}













