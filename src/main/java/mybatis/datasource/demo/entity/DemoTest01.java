package mybatis.datasource.demo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * demo_test01
 * @author 
 */
@Data
public class DemoTest01 implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}