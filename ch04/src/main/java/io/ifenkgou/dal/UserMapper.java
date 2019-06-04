package io.ifenkgou.dal;

import io.ifenkgou.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * . <br />
 *
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2019/6/4
 */
@Mapper
public interface UserMapper {

    /**
     * 获取用户列表
     * @param filter 名称过滤条件
     * @return
     */
    List<User> getUserList(String filter);
    /**
     * 更新User对象
     */
    void update();
}
