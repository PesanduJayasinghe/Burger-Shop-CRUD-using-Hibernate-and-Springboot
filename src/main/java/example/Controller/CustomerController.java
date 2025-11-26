package example.Controller;

import example.Model.DTO.CustomerDto;
import example.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public String sample(){
        return "Customer ready";
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody CustomerDto customerDto){
        customerService.addCustomer(customerDto);
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
    }

    @GetMapping("/all")
    public List<CustomerDto> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @GetMapping("search/{id}")
    public CustomerDto searchCustomer(@PathVariable String id){
        return customerService.searchCustomer(id);
    }


}
