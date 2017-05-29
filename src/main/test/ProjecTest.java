import com.elder.domain.Project;
import com.elder.util.page.PageModel;
import org.junit.Test;

import java.util.Map;

/**
 * Created by jsf on 2017/5/28.
 */
public class ProjecTest extends BaseJunitTest {

    @Test
    public void queryAllUserByPageTest(){
        String url=localhost+"/project/queryAllProjectByPage";
        PageModel<Project> projectPageModel=new PageModel<>();
        projectPageModel.setCurrentPage(1);
        projectPageModel.setPageSize(8);
        Map<String,Object> responseMap=restTemplate.postForObject(url,projectPageModel,Map.class);
        assertEquals("查询成功",(String)responseMap.get("msg"));
    }
}
