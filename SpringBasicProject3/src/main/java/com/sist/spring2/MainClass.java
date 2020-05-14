package com.sist.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext app=
        		new ClassPathXmlApplicationContext("app2.xml");
        EmpDAO dao=(EmpDAO)app.getBean("dao");
        List<DeptVO> list=dao.empAllData();
        for(DeptVO vo:list)
        {
        	System.out.println(vo.getDeptno()+" "+vo.getDname()+" "+vo.getLoc());
        }
	}

}
