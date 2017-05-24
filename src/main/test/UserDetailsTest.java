import com.elder.domain.UserDetails;
import com.elder.util.page.PageModel;
import org.junit.Test;

import java.util.Map;

/**
 * Created by jsf on 2017/5/24.
 */
public class UserDetailsTest extends BaseJunitTest{

    @Test
    public void queryAllUserByPageTest(){
        String url=localhost+"/userDetails/queryAllUserDetailsByPage";
        PageModel<UserDetails> userDetailsPageModel=new PageModel<>();
        userDetailsPageModel.setCurrentPage(2);
        userDetailsPageModel.setPageSize(8);
        Map<String,Object> responseMap=restTemplate.postForObject(url,userDetailsPageModel,Map.class);
        assertEquals("查询成功",(String)responseMap.get("msg"));
    }

}
