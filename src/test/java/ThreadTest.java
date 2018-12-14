import com.you.logutil.LogUtil;
import com.you.threadutil.ThreadUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <一句话说明功能>
 * <功能详细描述>
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2018/12/14 17:49
 * @since <版本号>
 */

public class ThreadTest {
    private  Logger logger= LoggerFactory.getLogger(ThreadTest.class);
    @Test
    public void threadTest(){
        ThreadUtil.pool.execute(()->{
            LogUtil.debug(logger,"==线程开始bbb===");
        });
        LogUtil.debug(logger,"==线程结束aa===");
    }
}
