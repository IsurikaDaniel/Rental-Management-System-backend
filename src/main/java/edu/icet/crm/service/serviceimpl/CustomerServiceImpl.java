package edu.icet.crm.service.serviceimpl;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import edu.icet.crm.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<Customer> getAll() {
        List<Customer> customerArrayList = new ArrayList<>();
        repository.findAll().forEach(entity -> customerArrayList.add(mapper.map(entity, Customer.class)));
        return customerArrayList;
    }

    @Override
    public void addDetails(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

//    @Override
//    public Customer searchItemsById(Integer id) {
//        return mapper.map(repository.findById(id), Customer.class);
//    }
}
