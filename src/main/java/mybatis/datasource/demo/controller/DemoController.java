package mybatis.datasource.demo.controller;

import mybatis.datasource.demo.entity.DemoTest01;
import mybatis.datasource.demo.entity.DemoTest02;
import mybatis.datasource.demo.mapper1.DemoTest01Mapper;
import mybatis.datasource.demo.mapper2.DemoTest02Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: sush4
 * @Description:
 * @Date: 2020/7/15
 */
@Controller
public class DemoController {
    @Resource
    private DemoTest01Mapper demoTest01Mapper;
    @Resource
    private DemoTest02Mapper demoTest02Mapper;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        DemoTest01 demoTest01 = demoTest01Mapper.selectByPrimaryKey(1);
        DemoTest02 demoTest02 = demoTest02Mapper.selectByPrimaryKey(1);

        return demoTest01.toString() + demoTest02.toString();
    }
}
