package example.Service;

import example.Model.DTO.CustomerDto;
import example.Model.Entity.Customer;
import example.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getObject(CustomerDto customerDto){

        return new Customer(
                customerDto.getCustID(),
                customerDto.getCustName(),
                customerDto.getCustAddress(),
                customerDto.getCustDOB(),
                customerDto.getCustSalary(),
                customerDto.getCustCity(),
                customerDto.getCustCountry(),
                customerDto.getCustZip()
        );
    }

    public void addCustomer(CustomerDto customerDto) {

        customerRepository.save(getObject(customerDto));

    }

    public void updateCustomer(CustomerDto customerDto) {

        customerRepository.save(getObject(customerDto));

    }

    public void deleteCustomer(String id) {

        customerRepository.deleteById(id);

    }

    public List<Customer> getAllCustomer(){

        return customerRepository.findAll();

    }


    public Customer searchCustomer(String id) {

        return customerRepository.getById(id);

    }
}
