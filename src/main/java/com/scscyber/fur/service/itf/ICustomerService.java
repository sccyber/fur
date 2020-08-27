package com.scscyber.fur.service.itf;
import com.scscyber.fur.model.pojo.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer();
    Customer getCustomerById(int id);
    Customer getCustomerByName(String roleName);
    Customer getCustomerByEmail(String email);
}
