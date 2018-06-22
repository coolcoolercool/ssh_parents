package cn.itcast.crm.service;

import cn.itcast.crm.dao.CustomerDao;
import cn.itcast.crm.domain.Customer;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/7 9:53
 */


public class CustomerServiceImpl implements CustomerService{
    //注意
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}





























