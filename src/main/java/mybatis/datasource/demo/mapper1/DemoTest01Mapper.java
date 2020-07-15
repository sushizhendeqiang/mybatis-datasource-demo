package mybatis.datasource.demo.mapper1;

import mybatis.datasource.demo.entity.DemoTest01;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoTest01Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DemoTest01 record);

    int insertSelective(DemoTest01 record);

    DemoTest01 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoTest01 record);

    int updateByPrimaryKey(DemoTest01 record);
}