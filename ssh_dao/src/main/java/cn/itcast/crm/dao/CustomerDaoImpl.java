package cn.itcast.crm.dao;

import cn.itcast.crm.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/6 22:11
 */


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public List<Customer> findAll() {
        return (List<Customer>) this.getHibernateTemplate().find("from Customer");
    }
}




















