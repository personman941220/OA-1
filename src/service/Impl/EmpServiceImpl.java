package service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.EmpMapper;
import pojo.Emp;
import service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {

	//��Ҫע��mapper��
	@Autowired
	EmpMapper empMapper;
	//��д�ӿڵķ���
	@Override
	public Emp login(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.login(emp);
	}

}
