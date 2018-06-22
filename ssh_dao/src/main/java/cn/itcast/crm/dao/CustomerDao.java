package cn.itcast.crm.dao;

import cn.itcast.crm.domain.Customer;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/6 22:10
 */


public interface CustomerDao {
    /*
    * 查询出Customer 表中的所有记录
    * */
    public List<Customer> findAll();
}
