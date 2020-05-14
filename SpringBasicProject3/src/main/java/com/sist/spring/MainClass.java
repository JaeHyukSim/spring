package com.sist.spring;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �����̳ʿ� XML���� ���� => �Ľ�=> ��ϵ� Ŭ������ �޸� �Ҵ�
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		/*
		 *    Ŭ���� �޸� �Ҵ�
		 *    setXxx()�� ���� ä��� 
		 *    init-method�� �����ϸ� ȣ�� 
		 *    ======================
		 *      ���α׷��Ӱ� �ʿ��� �޼ҵ带 ȣ���ؼ� ���
		 *    ======================
		 *    destory-method�� ȣ�� 
		 *    �޸𸮸� ���� 
		 */
		EmpDAO dao=(EmpDAO)app.getBean("dao");
		List<EmpVO> list=dao.empAllData();
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEname()+" "+vo.getSal()+" "+vo.getJob());
		}
	}

}








