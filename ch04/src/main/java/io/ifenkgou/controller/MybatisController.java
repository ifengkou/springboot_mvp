package io.ifenkgou.controller;

import io.ifenkgou.common.JsonResult;
import io.ifenkgou.dal.UserMapper;
import io.ifenkgou.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * . <br />
 *
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2019/6/4
 */
@RestController
@RequestMapping("/users")
public class MybatisController {
    private final static Logger logger = LoggerFactory.getLogger(MybatisController.class);

    @Autowired
    UserMapper userMapper;

    @GetMapping()
    public JsonResult getUserList(@RequestParam("name")String filter) {
        logger.info("获取用户列表");
        List<User> userList = userMapper.getUserList(filter);
        return new JsonResult<>(userList);
    }
}
