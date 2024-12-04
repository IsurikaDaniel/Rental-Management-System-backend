package edu.icet.crm.controller;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/CustomerOrder")
@RequiredArgsConstructor
public class CustomerController {
   private final CustomerService service;

    @GetMapping("/get-all")
    public List<Customer> getOrder(){
        return service.getAll();
    }

    @PostMapping("/add-Customer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDetails(@RequestBody Customer customer){
        service.addDetails(customer);
    }

//    @GetMapping("/search-by-id/{id}")
//    public  Customer searchItemsById(@PathVariable Integer id){
//        return service.searchItemsById(id);
//    }

}
