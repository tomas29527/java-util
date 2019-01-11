package com.you.proxy;

import com.you.logutil.LogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <一句话说明功能>
 * <功能详细描述>
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2019/1/11 14:43
 * @since <版本号>
 */
public class UserCglib {
    Logger logger = LoggerFactory.getLogger(getClass());
    public void add(String a){
        LogUtil.info(logger,"新增一条数据,入参:{}",a);
    }
}
