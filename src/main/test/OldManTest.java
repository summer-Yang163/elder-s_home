import com.elder.domain.OldMan;
import com.elder.util.page.PageModel;
import org.junit.Test;

import java.util.Map;

/**
 * Created by jsf on 2017/5/27.
 */
public class OldManTest extends BaseJunitTest {


    @Test
    public void queryAllOldManByPageTest(){
        String url=localhost+"/oldMan/queryAllOldManByPage";
        PageModel<OldMan> oldManPageModel=new PageModel<>();
        oldManPageModel.setCurrentPage(1);
        oldManPageModel.setPageSize(6);
        Map<String,Object>  responseMap=restTemplate.postForObject(url,oldManPageModel,Map.class);
        assertEquals("查询成功",(String)responseMap.get("msg"));
    }
    @Test
    public void deleteOldManByOldIdTest(){
        String url=localhost+"/oldMan/deleteOldManByUserId/{oldId}";
        Map<String,Object>  responseMap=restTemplate.getForObject(url,Map.class,2);
        assertEquals("成功删除",(String)responseMap.get("msg"));
    }
    @Test
    public void updateOldManTest(){
        String url=localhost+"/oldMan//updateOldMan";
        OldMan oldMan=new OldMan();
        oldMan.setOldId(3);
        oldMan.setOldName("司马值");
        Map<String,Object> responseMap=restTemplate.postForObject(url,oldMan,Map.class);
        assertEquals("更新成功",(String)responseMap.get("msg"));
    }

}
