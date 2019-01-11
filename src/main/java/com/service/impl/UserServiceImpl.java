package com.service.impl;

import com.service.IUserService;
import com.you.logutil.LogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <一句话说明功能>
 * <功能详细描述>
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2019/1/11 11:31
 * @since <版本号>
 */
public class UserServiceImpl implements IUserService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void insert(String name) {
        LogUtil.info(logger,"新增一条数据");
    }

    @Override
    public void update(int id) {
        LogUtil.info(logger,"修改一条数据");
    }
}
