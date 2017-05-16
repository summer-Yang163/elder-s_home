import com.elder.domain.User;
import com.elder.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by jsf on 2017/5/16.
 */
public class UserTest extends BaseJunitTest {
     @Autowired
     private UserMapper userMapper;

     @Test
     public void loginTest(){
        User user=new User(1,"zhangsan","666888");
        String uri=localhost+"/user/login";
        Map<String,Object> responseMap=restTemplate.getForObject(uri,Map.class,"zhangsan","666888");
        assertEquals(String.valueOf(responseMap.get("msg")),"登录成功");
        assertEquals((boolean)responseMap.get("success"),true);
     }
}
