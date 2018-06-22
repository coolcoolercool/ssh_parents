import cn.itcast.crm.dao.CustomerDao;
import cn.itcast.crm.domain.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/7 9:19
 */


public class CustomerTest {

    @Test
    public void testFindAll(){
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");

        CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");

        List<Customer> list = customerDao.findAll();
        System.out.println(list.size());
    }
}































