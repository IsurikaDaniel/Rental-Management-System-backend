package edu.icet.crm.service.serviceimpl;

import edu.icet.crm.dto.HardwareItems;
import edu.icet.crm.entity.HardwareItemsEntity;
import edu.icet.crm.repository.HardwareRepository;
import edu.icet.crm.service.HardwareService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HardwareServiceImpl implements HardwareService {

    private final HardwareRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<HardwareItems> getAll() {
        List<HardwareItems> HardwareItemsArrayList = new ArrayList<>();
        repository.findAll().forEach(entity -> HardwareItemsArrayList.add(mapper.map(entity, HardwareItems.class)));
        return HardwareItemsArrayList;
    }

    @Override
    public void addItems(HardwareItems hardwareItems) {
        repository.save(mapper.map(hardwareItems, HardwareItemsEntity.class));

    }

    @Override
    public void updateItems(HardwareItems hardwareItems) {
        repository.save(mapper.map(hardwareItems, HardwareItemsEntity.class));
    }

    @Override
    public void deleteItemsById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public HardwareItems searchItemsById(Integer id) {
        return mapper.map(repository.findById(id), HardwareItems.class);
    }
}
