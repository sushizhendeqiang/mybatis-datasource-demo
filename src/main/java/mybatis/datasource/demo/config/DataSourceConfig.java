package mybatis.datasource.demo.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


/**
 * @Author: sush4
 * @Description:多数据源配置
 * @Date: 2020/7/15
 */
@Configuration
@PropertySource(value = "classpath:application.yml")
public class DataSourceConfig {

    /**
     * @return
     * @Description： * @Bean 告诉方法，产生了一个bean对象
     * * @ConfigurationProperties 获取参数配置
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.one")
    DataSource dataSourceOne() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.two")
    DataSource dataSourceTwo() {
        return DruidDataSourceBuilder.create().build();
    }
}
