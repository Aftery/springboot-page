package top.aftery;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.aftery.entity.User;
import top.aftery.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
@SuppressWarnings("all")
public class SpringbootPageApplicationTests {

    @Autowired
    private UserService service;

    @Test
    public void contextLoads() {
        List<User> users = service.queryUserList();
        for (User user : users) {
            log.info("\n toString:{}", user);
        }
    }


    @Test
    public void add() {
        User user;
        List<String> sexList = new ArrayList<>();
        sexList.add("男");
        sexList.add("女");
        for (int i=0;i<200;i++) {
            user = new User();
            user.setAge(RandomUtil.randomInt(0, 100));
            user.setName(RandomUtil.randomString(3));
            user.setPassword(IdUtil.simpleUUID());
            user.setSex(RandomUtil.randomEle(sexList));
            service.save(user);
        }

    }

}
