package com.sist.spring2;
import java.util.*;
public class EmpDAO {
    private EmpMapper mapper;

	public void setMapper(EmpMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<DeptVO> empAllData()
	{
		return mapper.empAllData();
	}
   
}
