import com.you.http.HttpUpFile;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

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
    public void threadTest() throws IOException {

        HttpUpFile h =new HttpUpFile();
        //h.download("http://img.zcool.cn/community/01f9ea56e282836ac72531cbe0233b.jpg@2o.jpg","",0,0);
       h.download("http://f.hengkuaidai.com//mnt/img/hkd_07/07_22/07_22_579/20180415/20180415225106_jxccxwoa6x_appTh.png","",0,0);

    }
}
