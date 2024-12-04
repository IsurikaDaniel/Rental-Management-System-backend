package edu.icet.crm.repository;

import edu.icet.crm.entity.HardwareItemsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardwareRepository extends CrudRepository<HardwareItemsEntity,Integer> {
}
