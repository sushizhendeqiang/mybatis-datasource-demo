package mybatis.datasource.demo.mapper2;

import mybatis.datasource.demo.entity.DemoTest02;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoTest02Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DemoTest02 record);

    int insertSelective(DemoTest02 record);

    DemoTest02 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoTest02 record);

    int updateByPrimaryKey(DemoTest02 record);
}