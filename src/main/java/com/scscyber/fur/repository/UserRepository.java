package com.scscyber.fur.repository;
import java.util.List;
import com.scscyber.fur.model.pojo.Customer;
import com.scscyber.fur.model.pojo.User;

public interface UserRepository {
	List<Customer> getAllUser();
    User getUserById(int id);
    User getUserByName(String firstLastName);
    User getUserByEmail(String email);
}
