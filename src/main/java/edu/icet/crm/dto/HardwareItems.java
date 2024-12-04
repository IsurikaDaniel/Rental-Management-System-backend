package edu.icet.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HardwareItems {
    private Integer id;
    private String name;
    private String availability;
    private Double finePerDay;
    private Double rentalPerDay;

}
