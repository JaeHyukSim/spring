package com.sist.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/*
 *   <bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
       p:dataSource-ref="ds"
       p:configLocation="classpath:Config.xml"
    />
     
    
    @Autowired => �ڵ����� (Ŭ������ �޸� �ּҸ� ����) => �������� ��ϵ� Ŭ���� ����� ���� 
    @ => TYPE
    public class A
    {
        @
        MyDAO dao; => FIELD
        
        @
        public A(String name){} => CONSTRUCTOR
        
        @
        public void setMyDAO(MyDAO dao){} => PARAMETER
        
        @
        public void display(MyDAO dao){}
    }
     
 */
/*
 *   => Ŭ���� �޸� �Ҵ� (Ŭ���� ������)
 *   => ��� ������ ���� ����
 *   => Ŭ������ �޸� ���� 
 *   => �ݺ����� �ڵ��� ���� => �ҽ� ����ȭ , ������ , ���뼺
 */
//import java.sql.*;
//import java.util.*;
@Component("ssf")
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean{
    /*@Autowired
    @Qualifier("ds")*/
	//@Resource(name="ds")
	@Autowired
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		super.setDataSource(dataSource);
	}
	
	public MySqlSessionFactoryBean()
	{
		try
		{
			org.springframework.core.io.Resource res=
					new ClassPathResource("Config.xml");
			//java.util.Date date=new java.util.Date();
			setConfigLocation(res);
		}catch(Exception ex){}
	}
   
}







