package edu.icet.crm.repository;

import edu.icet.crm.entity.RentalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends CrudRepository<RentalEntity,Integer> {

}
