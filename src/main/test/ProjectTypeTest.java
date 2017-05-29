import org.junit.Test;

import java.util.Map;

/**
 * Created by jsf on 2017/5/28.
 */
public class ProjectTypeTest extends BaseJunitTest {

    @Test
    public void queryAllProjectTypeTest(){
        String url=localhost+"/projectType/queryAllProjectType";
        Map<String,Object> responseMap=restTemplate.postForObject(url,null,Map.class);
        assertEquals("查询成功",(String)responseMap.get("msg"));

    }
}
