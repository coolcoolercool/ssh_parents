package cn.itcast.crm.web;

import cn.itcast.crm.domain.Customer;
import cn.itcast.crm.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/7 10:21
 */


public class CustomerAction extends ActionSupport {
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService){
        this.customerService = customerService;
    }

    /*
    * 查询所有的数据
    * */
    public String execute() throws Exception{
        List<Customer> list = customerService.findAll();
        System.out.println(list.size());

        ActionContext.getContext().put("list",list);
        return SUCCESS;
    }
}

















