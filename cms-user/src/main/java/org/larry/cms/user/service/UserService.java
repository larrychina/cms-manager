package org.larry.cms.user.service;

import org.larry.cms.core.dto.ExecuteResult;
import org.larry.cms.core.page.Page;
import org.larry.cms.user.entity.User;

import java.util.List;

/**
 * Created by Larry on 2017/3/6.
 */
public interface UserService {

    // 分页查询用户信息
    public ExecuteResult<List<User>> findByPage(Page page) ;


}
