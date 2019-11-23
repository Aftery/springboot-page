package top.aftery.entity;

import lombok.Data;

/**
 * @Author Aftery
 * @Date 2019/11/23 19:55
 * @Version 1.0
 **/
@Data
@SuppressWarnings("all")
public class User {

    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Integer age;
}
