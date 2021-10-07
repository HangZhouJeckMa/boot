import com.jxd.hello.HelloApplication;
import com.jxd.hello.dao.IEmpDao;
import com.jxd.hello.model.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author:WWW
 * @Date:2021/9/24 0024
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class TestUnit {
    @Autowired
    private IEmpDao empDao;
    //一个方法是一个测试单元
    @Test
    public void testDao(){
        List<Emp> list = empDao.selectAll();
        for (Emp emp:list){
            System.out.println(emp.getEname());
        }
    }
}
