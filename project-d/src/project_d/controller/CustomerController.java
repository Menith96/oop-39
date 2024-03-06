package project_d.controller;
import project_b.service.CustomerService;
import project_b.util.Transformer;
import project_d.aop.*;
import project_c.repo.CustomerRepo;
public class CustomerController {
    CustomerAop customerAop =new CustomerAop();
    CustomerRepo customerRepo = new CustomerRepo();
    CustomerService customerService = new CustomerService();

    Transformer transformer =new Transformer();

}
