package wang.xpro.datamanage.services;


import wang.xpro.datamanage.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 新增一个用户
     *
     * @param name
     * @param age
     */
    int create(String name, Integer age);

    /**
     * 根据name查询用户
     *
     * @param id
     * @return
     */
    List<User> getById(Long id);

    /**
     * 根据name删除用户
     *
     * @param id
     */
    int deleteById(Long id);

    /**
     * 获取用户总量
     */
    int getAllUsers();

    /**
     * 删除所有用户
     */
    int deleteAllUsers();
}
