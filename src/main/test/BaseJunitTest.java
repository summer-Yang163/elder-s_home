import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jsf on 2017/5/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration
        ({"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"}) //加载配置文件
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BaseJunitTest  extends TestCase{
     protected RestTemplate restTemplate=new RestTemplate();
     private String local="localhost";
     protected String localhost="http://"+local+":8080/elder";
}
