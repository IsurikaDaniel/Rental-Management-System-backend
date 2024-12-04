package edu.icet.crm.controller;

import edu.icet.crm.dto.ApiResponse;
import edu.icet.crm.dto.Customer;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ApiResponse> addDetails(@RequestBody Customer customer){

        try {
            service.addDetails(customer);
            return ResponseEntity.ok(new ApiResponse("200", "Customer added successfully.", true));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse("400", "Failed to add Customer: " + e.getMessage(), false));
        }
    }


}
