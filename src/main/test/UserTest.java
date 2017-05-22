import com.alibaba.fastjson.JSONObject;
import com.elder.domain.User;
import com.elder.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by jsf on 2017/5/16.
 * 测试用例，一般来每一个service方法对应一个测试用例，命名规则为：方法名+Test
 */
public class UserTest extends BaseJunitTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void userLoginTest() {
        User user = new User();
        user.setUserName("zhangsan");
        user.setPassword("666888");
        String url=localhost+"/user/userLogin";
        Map<String, Object> responseMap = restTemplate.postForObject(url,user,Map.class);
        assertEquals(Integer.valueOf(1),(Integer) responseMap.get("Type_Id"));
        assertEquals("登录成功", (String) responseMap.get("msg"));//前面是期望值，通常是用户指定的内容，actual是被测试的代码返回的实际值
        assertEquals(true, (boolean) responseMap.get("success"));
    }

    @Test
    public void registerUserTest() {
        String url = localhost + "/user/registerUser/{userName}/{password}";
        Map<String, Object> responseMap = restTemplate.getForObject(url, Map.class, "gyf", "666888");
        assertEquals("注册成功", (String) responseMap.get("msg"));
    }

    @Test
    public void validateUserNameTest() {
        String url = localhost + "/user/validateUserName/{userName}";
        Map<String, Object> responseMap = restTemplate.getForObject(url, Map.class, "zhangsan");
        assertEquals("该用户名已经存在", (String) responseMap.get("mag"));
//         Map<String,Object> responseMap1=restTemplate.getForObject(url,Map.class,"jsf");
//         assertEquals("该用户名可以使用",(String)responseMap1.get("msg"));

    }


}
