package edu.icet.crm.service;

import edu.icet.crm.dto.Rental;

import java.util.List;

public interface RentalService {
    List<Rental> getAll();
    void addRental(Rental rental);
    void updateRental(Rental rental);
    void deleteRentalById(Integer id);
    Rental searchRentalById(Integer id);
}
