package edu.icet.crm.service.serviceimpl;

import edu.icet.crm.dto.Rental;
import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.repository.RentalRepository;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final RentalRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Rental> getAll() {
        List<Rental> rentalArrayList = new ArrayList<>();
        repository.findAll().forEach(entity -> rentalArrayList.add(mapper.map(entity, Rental.class)));
        return rentalArrayList;
    }

    @Override
    public void addRental(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));

    }

    @Override
    public void updateRental(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public void deleteRentalById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Rental searchRentalById(Integer id) {
        return mapper.map(repository.findById(id), Rental.class);
    }
}
