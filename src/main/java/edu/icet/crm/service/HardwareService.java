package edu.icet.crm.service;

import edu.icet.crm.dto.HardwareItems;
import java.util.List;

public interface HardwareService {
    List<HardwareItems> getAll();
    void addItems(HardwareItems hardwareItems);
    void updateItems(HardwareItems hardwareItems);
    void deleteItemsById(Integer id);
    HardwareItems searchItemsById(Integer id);
}
