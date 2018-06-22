package cn.itcast.crm.service;

import cn.itcast.crm.domain.Customer;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/7 9:51
 */


public interface CustomerService {
    /*
    * 查询所有客户列表
    * */
    public List<Customer> findAll();
}
