package com.cjc.chatchat.service.api;

import com.cjc.chatchat.entity.UserPO;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/12/9
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
*/
public interface UserService {

    /**
     *保存用户
     * @param userPO
     */
    public void saveUser(UserPO userPO);

    /**
     *通过登录帐户获取用户
     * @param loginAcct
     * @return
     */
    public UserPO getUserByLoginAcct(String loginAcct);

}
