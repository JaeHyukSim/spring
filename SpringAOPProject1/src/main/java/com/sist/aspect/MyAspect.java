package com.sist.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/*
 *   public void emp_select()
     {
	   //getConnection();
	   System.out.println("EMP ���̺����� �����͸� ������ �´�");
	   //disConnection();
     }
 */
@Aspect
@Component
public class MyAspect {
	   // �޼ҵ� ȣ����
	   /*
	    *    * com.sist.dao.EmpDAO.emp_*(..)
	    *   == ==========Ŭ������       ======�����ϴ� �޼ҵ� ..(�Ű������� �������)
	    *   return��                             �Ű����� (X) , �Ű����� (1), �Ű�����(������..)
	    */
	   @Before("execution(* com.sist.dao.EmpDAO.emp_*(..))")
	   public void getConnection()
	   {
		   System.out.println("����Ŭ ����");
	   }
	   // finally
	   @After("execution(* com.sist.dao.EmpDAO.emp_*(..))")
	   public void disConnection()
	   {
		   System.out.println("����Ŭ ���� ����");
	   }
	   // ��������� �� ��� 
	   @AfterReturning(value="execution(* com.sist.dao.EmpDAO.emp_*(..))",returning="ret")
	   // returning="ret" => ���ϰ� 
	   public void returnValue(Object ret)
	   {
		   if(ret!=null)
		   System.out.println(ret);
	   }
	   // �޼ҵ� �����ϴ� ���� => ������ �߻��� ��쿡 ó��
	   @AfterThrowing(value="execution(* com.sist.dao.EmpDAO.emp_*(..))",throwing="ex")
	   public void exceptionValue(Throwable ex)
	   {
		   System.out.println(ex.getMessage());
	   }
	   // log���� ���� , Ʈ����� ó�� 
	   @Around("execution(* com.sist.dao.EmpDAO.display())")
	   public Object display(ProceedingJoinPoint jp) throws Throwable
	   {
		   
		   System.out.println(jp.getSignature().getName());
		   long start=System.currentTimeMillis();
		   // setAutoCommit(false)
		   Object obj=jp.proceed();// display 
		   // conn.commit()
		   long end=System.currentTimeMillis();
		   System.out.println("����ð�:"+(end-start));
		   return obj;
	   }
	   
}




