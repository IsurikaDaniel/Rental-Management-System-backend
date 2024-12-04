package edu.icet.crm.controller;

import edu.icet.crm.dto.HardwareItems;
import edu.icet.crm.service.HardwareService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hardwareItems")
@RequiredArgsConstructor

public class HardwareController {
    private final HardwareService service;

    @GetMapping("/get-all")
    public List<HardwareItems> getHardwareItems(){
        return service.getAll();
    }

    @PostMapping("/add-hardwareItems")
    @ResponseStatus(HttpStatus.CREATED)
    public void addItems(@RequestBody HardwareItems hardwareItems){
        service.addItems(hardwareItems);
    }

    @PutMapping("/update-hardwareItems")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateItems(@RequestBody HardwareItems hardwareItems){
        service.updateItems(hardwareItems);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteItemsById(@PathVariable Integer id){
        service.deleteItemsById(id);
    }
    @GetMapping("/search-by-id/{id}")
    public HardwareItems searchItemsById(@PathVariable Integer id){
        return service.searchItemsById(id);
    }
}

