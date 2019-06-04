package io.ifenkgou.controller;

import io.ifenkgou.common.JsonResult;
import io.ifenkgou.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * . <br />
 *
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2019/6/4
 */
@RestController
public class JsonBeanController {

    @GetMapping("user")
    public JsonResult<User> getUser(){
        User user = new User();
        user.setId(0);
        user.setName("logan");

        return new JsonResult(user);
    }
}
