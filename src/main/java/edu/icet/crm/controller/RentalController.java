package edu.icet.crm.controller;

import edu.icet.crm.dto.ApiResponse;
import edu.icet.crm.dto.Customer;
import edu.icet.crm.dto.Rental;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rental")
@RequiredArgsConstructor
public class RentalController {

    final RentalService service;

    @GetMapping("/get-all")
    public List<Rental> getRental(){
        return service.getAll();
    }

    @PostMapping("/add-rental")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ApiResponse> addRental(@RequestBody Rental rental){

        try {
            service.addRental(rental);
            return ResponseEntity.ok(new ApiResponse("200", "Rental added successfully.", true));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse("400", "Failed to add Rental: " + e.getMessage(), false));
        }
    }

    @PutMapping("/update-rental")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateRental(@RequestBody Rental rental){
        service.updateRental(rental);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteRentalById(@PathVariable Integer id){
        service.deleteRentalById(id);
    }
    @GetMapping("/search-by-id/{id}")
    public Rental searchRentalById(@PathVariable Integer id){
        return service.searchRentalById(id);
    }
}
