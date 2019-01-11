import com.service.IUserService;
import com.you.proxy.ServiceProxy;
import com.you.proxy.UserCglib;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * <一句话说明功能>
 * <功能详细描述>
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2019/1/11 13:44
 * @since <版本号>
 */
public class CGlibTest {

    @Test
    public void test(){
        ServiceProxy  proxy =new ServiceProxy();
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(UserCglib.class);
        enhancer.setCallback(proxy);
        UserCglib userCglib = (UserCglib) enhancer.create();
        userCglib.add("cccc");
    }
    @Test
    public void test1(){
        ServiceProxy  proxy =new ServiceProxy();
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(IUserService.class);
        enhancer.setCallback(proxy);
        IUserService userService = (IUserService) enhancer.create();
        userService.insert("aaa");
    }

}
