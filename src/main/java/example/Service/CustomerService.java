package example.Service;

import example.Model.DTO.CustomerDto;
import example.Model.Entity.Customer;
import example.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

        customerRepository.save(
                new Customer(
                        customerDto.getCustID(),
                        customerDto.getCustName(),
                        customerDto.getCustAddress(),
                        customerDto.getCustDOB(),
                        customerDto.getCustSalary(),
                        customerDto.getCustCity(),
                        customerDto.getCustCountry(),
                        customerDto.getCustZip()
                )
        );

    }

    public void updateCustomer(CustomerDto customerDto) {

        customerRepository.save(
                new Customer(
                        customerDto.getCustID(),
                        customerDto.getCustName(),
                        customerDto.getCustAddress(),
                        customerDto.getCustDOB(),
                        customerDto.getCustSalary(),
                        customerDto.getCustCity(),
                        customerDto.getCustCountry(),
                        customerDto.getCustZip()
                )
        );

    }

    public void deleteCustomer(String id) {

        customerRepository.deleteById(id);

    }

    public List<CustomerDto> getAllCustomer(){

       List<Customer> all=customerRepository.findAll();
       ArrayList<CustomerDto> customerDtoList = new ArrayList<>();

       for(Customer customer : all){
            customerDtoList.add(
                    new CustomerDto(
                        customer.getCustID(),
                        customer.getCustName(),
                        customer.getCustAddress(),
                        customer.getCustDOB(),
                        customer.getCustSalary(),
                        customer.getCustCity(),
                        customer.getCustCountry(),
                        customer.getCustZip()

                    )
            );
       }
       return customerDtoList;
    }


    public CustomerDto searchCustomer(String id) {

       Customer customer=customerRepository.getById(id);

        return new CustomerDto(
                customer.getCustID(),
                customer.getCustName(),
                customer.getCustAddress(),
                customer.getCustDOB(),
                customer.getCustSalary(),
                customer.getCustCity(),
                customer.getCustCountry(),
                customer.getCustZip()

        );
    }
}
