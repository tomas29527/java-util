package com.you.logutil;

import org.slf4j.Logger;

/**
 * 日志工具类
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2018/12/14 18:01
 * @since <版本号>
 */
public class LogUtil {

    public static void debug(Logger logger, String msg, Object... obj) {
        if (logger.isDebugEnabled()) {
            logger.debug(msg, obj);
        }
    }

    public static void info(Logger logger, String msg, Object... obj) {
        if (logger.isInfoEnabled()) {
            logger.info(msg, obj);
        }
    }

    public static void warn(Logger logger, String msg, Object... obj) {
        if (logger.isWarnEnabled()) {
            logger.warn(msg, obj);
        }
    }

    public static void error(Logger logger, String msg, Throwable t) {
        if (logger.isErrorEnabled()) {
            logger.error(msg, t);
        }
    }
}
