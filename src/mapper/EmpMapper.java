package mapper;

import org.apache.ibatis.annotations.Mapper;

import pojo.Emp;
@Mapper
public interface EmpMapper {
	//��¼����
    public Emp login(Emp emp);
}