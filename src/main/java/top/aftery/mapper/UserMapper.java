package top.aftery.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.aftery.entity.User;

import java.util.List;

/**
 * @Author Aftery
 * @Date 2019/11/23 19:55
 * @Version 1.0
 **/
@Mapper
public interface UserMapper {

    List<User> queryUserList();


    void save(User user);

}
