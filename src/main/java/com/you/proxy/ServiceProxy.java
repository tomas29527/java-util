package com.you.proxy;

import com.you.logutil.LogUtil;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * <一句话说明功能>
 * <功能详细描述>
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2019/1/11 11:38
 * @since <版本号>
 */
public class ServiceProxy implements MethodInterceptor {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String s = Arrays.toString(objects);
        LogUtil.info(logger,"入参：{}",s);
        methodProxy.invokeSuper(o,objects);
        return o;
    }
}
